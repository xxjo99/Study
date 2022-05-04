#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define STUDENT_ID 500 // 학생ID 2000~2499 (500개)
#define COURSE_ID 35 // 코스ID 100~134 (35개)

int studentID, courseNum;   // 학생ID, 코스
char instr[24]; // in파일에서 읽어온 문자열 저장
char input;		// in파일에서 읽어온 A or D
FILE *fp1, *fp2; // 읽을 파일 포인터

// 구조체 정의
typedef struct enroll_s* node_ptr;
typedef struct enroll_s {
	int stdnum;  // 학생ID
	int course_num;	// 코스ID
	node_ptr left;
	node_ptr right;
} enroll_s;

// 같은과목을 듣는 학생들의 ID를 저장
node_ptr course[COURSE_ID];
// 해당 학생ID가 듣는 COURSE_ID 저장
node_ptr students[STUDENT_ID];

/*
return 0 : 정상
return 1 : 중복등록
return 2 : 미등록
return 3 : 유효하지 않는 코스ID
return 4 : 유효하지 않는 학생ID
return 5 : A혹은 D가 아님
return 6 : ERR에 들어갈 변수 초기화
*/

// 삽입
int insert() {
	node_ptr new_node, pre_node; // 새로운노드, 전노드
	int si, cn, temp; // cn : 코스번호 크기, si: 학생id 크기
	si = studentID - 2000; // studentid : 0~499
	cn = courseNum - 100; // coursenum : 0~34

	new_node = malloc(sizeof(enroll_s));
	new_node->stdnum = studentID; // 학생id 저장
	new_node->course_num = courseNum; // 코스번호 저장
	new_node->left = NULL;
	new_node->right = NULL;

	// students 저장값이 0일경우 newnode 저장 (해당 학생이 듣는 과목)
	if (students[si] == 0) {
		students[si] = new_node;
	} 
	// 새로운 학생과 전 학생이 같을경우
	else if (students[si]->course_num == new_node->course_num) {
		return 1;
	}
	// 그외
	else {
		pre_node = students[si];   // 전 노드에 newnode 저장
		while (1) {
			//맨끝에 삽입
			if (pre_node->left == NULL) {
				new_node->left = NULL;
				pre_node->left = new_node;
				break;
			}
			// 새로운 studentId가 이전 studentId보다 작을경우 새로운 노드를 둘 사이에 삽입
			else if ((new_node->stdnum) < (pre_node->left->stdnum)) {
				new_node->left = pre_node->left;
				pre_node->left = new_node;
				break;
			}
			// 새로운 courseId와 이전 courseId가 같을경우
			else if (new_node->course_num == pre_node->left->course_num) {
				return 1;
			}
			// 왼쪽으로 이동
			else {
				pre_node = pre_node->left;
			}
		}
	}

	// course 저장값이 0이면 newnode저장 (같은 과목을 들을경우) 
	if (course[cn] == 0) {
		course[cn] = new_node;
	}
	// 그외
	else {
		pre_node = course[cn]; // 전 노드에 newnode저장

		while (1) {
			// 맨오른쪽에 새로운 노드 저장
			if (pre_node->right == NULL) {
				pre_node->right = new_node;
				new_node->right = NULL;
				break;
			}
			//새로운 studentId가 이전 studentId보다 작을경우 새로운 노드를 둘 사이에 삽입
			else if (pre_node->right->stdnum > new_node->stdnum){
				new_node->right = pre_node->right;
				pre_node->right = new_node;
				break;
			}
			pre_node = pre_node->right; //오른쪽으로 이동
		}

	}

	return 0;
}

// 삭제
int del() {
	int si, cn;
	node_ptr delnode, prenode;
	si = studentID - 2000;
	cn = courseNum - 100;
	prenode = students[si];

	// students 저장값이 0일경우
	if (students[si] == 0) {
		return 2;
	}

	// students 저장값이 studentID와 같을경우
	if (students[si]->stdnum == studentID) {
		students[si] = students[si]->right;
		delnode = prenode; // 삭제노드 = 전노드
	}
	// students저장값이 studentID보다 클경우
	else if ((students[si]->stdnum) > studentID) {
		return 2;
	}
	// 그외
	else {
		delnode = prenode->left;
		// NULL일때까지
		while (delnode) {
			//delnode에 지정한 학번이 있으면
			if (delnode->course_num == courseNum) {
				prenode->left = delnode->left;
			}
			else {
				prenode = delnode;
				delnode = delnode->left;
			}
		}
		return 2;
	}

	prenode = course[cn];
	// course값이 0일경우
	if (course[cn] == 0) {
		return 2;
	}

	// course에 studentID가 있을경우
	if (course[cn]->stdnum == studentID) {
		course[cn] = course[cn]->right;
		delnode = prenode; // 삭제 노드는 전노드
	}
	// course_num이 현재 courseNum 보다 클경우
	else if ((course[cn]->course_num) > courseNum) {
		return 2;
	}
	// 그외
	else {
		delnode = prenode->right;
		while (delnode) { 
			if (delnode->stdnum == studentID) {
				prenode->right = delnode->right;
			}
			else {
				prenode = delnode;
				delnode = delnode->left;
			}
		}
	}

	free(delnode);
	return 0;
}

// 에러
int return_Error1 = 0; // 중복등록
int return_Error2 = 0; // 미등록
int return_Error3 = 0; // 유효하지 않는 코스ID
int return_Error4 = 0; // 유효하지 않는 학생ID
int return_Error5 = 0; // A혹은 D가 아님
int _return_Error = 0; // ERR에 들어갈 변수 초기화

int return_Error(int ERR0) {
	switch (ERR0)
	{

	case 0: break;
	case 1: {
		return_Error1++;
		fprintf(fp2, "%d %d %c ", studentID, courseNum, input);
		fprintf(fp2, "\t ** 중복 등록 ** \n");
		break; 
	}
	case 2: {
		return_Error2++;
		fprintf(fp2, "%d %d %c ", studentID, courseNum, input);
		fprintf(fp2, "\t ** 미등록 ** \n");
		break;
	}
	case 3: {
		return_Error3++;
		fprintf(fp2, "%d %d %c ", studentID, courseNum, input);
		fprintf(fp2, "\t ** 유효하지 않는 코스 ID ** \n");
		break;
	}
	case 4: {
		return_Error4++;
		fprintf(fp2, "%d %d %c ", studentID, courseNum, input);
		fprintf(fp2, "\t ** 유효하지 않는 학생 ID ** \n");
		break;
	}
	case 5: {
		return_Error5++;
		fprintf(fp2, "%d %d %c ", studentID, courseNum, input);
		fprintf(fp2, "\t ** ‘A’ 혹은 ‘D’가 아님 ** \n");
		break;
	}

	}
	return 0;
}

// studentID, courseNum이 올바른 값인지 확인
int validNum() {
	studentID = courseNum = 0;
	studentID = stdnumReturn(4, 8); //studentID는 4~8열
	courseNum = courseReturn(15, 18); // courseNum은 15~18열
	input = instr[24];  // A or D는 25열

	// 유효하지 않는 코스 ID
	if ((courseNum < 100) || (courseNum >= 100 + COURSE_ID)) {
		return 3;
	}

	// 유효하지 않는 학생 ID
	if ((studentID < 2001) || (studentID >= 2000 + STUDENT_ID)) {
		return 4;
	}

	// A or D가 아닐경우
	if (input != 'A' && input != 'D') {
		return 5;
	}

	return 0;
}

// 자리수(3or4자리)에 맞춰 제곱
int squr(int a, int b) {
	int c = 1, i;
	for (i = 0; i != b - 1; i++) {
		c = c * a;
	}
	return c;
}

// 코스ID(세자리) return
int courseReturn(int start, int end) {
	int t = 3; // 3자리
	int n, op, course = 0;

	// 숫자를 char형으로 받아 계산
	for (int i = start; i != end; i++) {
		n = instr[i] - '0';
		op = squr(10, t);
		t--;
		course = course + op * n;
		n = 0;
	}

	return course;
}

// 학생ID(네자리) return
int stdnumReturn(int start, int end) {
	int t = 4;
	int n, op, stdnum = 0;  //학번은 4자리 이므로 t=4

	for (int i = start; i != end; i++) {
		n = instr[i] - '0';
		op = squr(10, t);
		t--;
		stdnum = stdnum + op * n;
		n = 0;
	}

	return stdnum;
}

// 출력
void print_list(node_ptr list, int n) {
	node_ptr a, b;
	int t, i = 0;

	a = list; // 출력할 노드
	b = list->right; // 다음 노드

	while (1) {

		if (a->right != NULL) {
			// 출력할 노드의 stdnum이 다음노드 stdnum보다 클경우
			if (a->stdnum > b->stdnum) {
				t = a->stdnum; // 출력할 노드 stdnum 저장
				a->stdnum = b->stdnum; // 전 stdnum 새로운 stdnum으로 저장
				b->stdnum = t;  // 출력할 stdnum를 다음노드 stdnum으로
				a->right = b;
			}
			// 출력할노드의 stdnum이 다음노드보다 작고 다음노드가 가리키는 값이 NULL이 아닐경우 다음으로 이동
			else if (a->stdnum < b->stdnum || b->right != NULL) {
				a = a->right;
				b = b->right;
			}
		}
		else break;
	}

	// 0일경우
	if (n == 0) {
		for (; list; list = list->right) {
			fprintf(fp2, " %d", list->stdnum);  //id_num 출력
		}
	}
	fprintf(fp2, "\n");
}

int main() {
	int line = 0; // 읽은 라인수
	int validReg = 0; // 유효한 등록
	int d = 0; // 취소
	int count = 0; // 반복

	char* infilename = "input.txt";
	char* outfilename = "output.txt";

	char buf[50];

	// 파일 읽기에 성공했을경우
	if ((fp1 = fopen(infilename, "r")) != NULL) {
		printf("파일읽기 성공\n");
	}
	// 그렇지않을경우
	else {
		printf("실패\n");
		return 1;
	}

	// 초기화
	for (count = 0; count != STUDENT_ID; count++) {
		students[count] = NULL;
	}
	for (count = 0; count != COURSE_ID; count++) {
		course[count] = NULL;
	}

	fp2 = fopen(outfilename, "w");
	// in파일에서 문자열 받아옴
	while (fgets(buf, 30, fp1)) {
		line++; // 라인수 증가
		strcpy(instr, buf);
		_return_Error = validNum(); // 올바른 값인지 확인

		// 0일경우 정상
		if (_return_Error != 0) {
			return_Error(_return_Error);
			continue;
		}

		// A or D
		switch (input)
		{
		case 'A': {
			// 등록되있을경우
			if (insert())	return_Error(1);
			else validReg++; // 등록되있으면 validReg++
			break;
		}
		case 'D': {
			// 등록되있지 않은경우
			if (del())	return_Error(2);
			// 등록되있을경우
			else {
				d++; // 취소 증가
				fprintf(fp2, "%d %d %c ", studentID, courseNum, input); fprintf(fp2, "\t ** 삭제 완료 ** \n");
			}
			break;
		}

		}
	}

	// 보고
	fprintf(fp2, "\n(1) 에러 보고\n");
	fprintf(fp2, "중복 등록 : %d\n", return_Error1);
	fprintf(fp2, "미등록 : %d\n", return_Error2);
	fprintf(fp2, "유효하지 않는 코스 ID : %d\n", return_Error3);
	fprintf(fp2, "유효하지 않는 학생 ID : %d\n", return_Error4);
	fprintf(fp2, "‘A’ 혹은 ‘D’가 아님 : %d\n", return_Error5);

	fprintf(fp2, "\n(2) 클라스 목록\n");
	for (count = 0; count < COURSE_ID; count++) {
		if (course[count] != NULL) {
			fprintf(fp2, "%d : ", course[count]->course_num);
			print_list(course[count], 0);
		}
	}

	fprintf(fp2, "\n(3) 입력에 대한 보고\n");
	fprintf(fp2, "읽은 라인 수: %d\n", line);
	fprintf(fp2, "유효 등록 수: %d\n", validReg);
	fprintf(fp2, "취소 수: %d", d);

	fclose(fp1);
	fclose(fp2);
	return 0;
}