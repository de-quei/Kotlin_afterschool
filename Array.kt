intArrayof(1,2,3)

//코틀린 배열을 선언할 때 사용하고
//1,2,3 순서대로 0,1,2 배열방에 들어가게 된다.

//배열 대신에 ArrayList를 사용한다. 
//추가할때는  add메소드
//꺼낼때는 get이라는 메소드를 사용한다. 

//2가지 방법으로 1차원 배열을 작성할 수 있다.
//var 배열명 = Array<데이터 형식>(개수, {초깃값})

//var배열명 = Array<데이터 형식)<개수>{초깃값}

fun main() {
    var one = Array<Int>(4,{0})
    one[0] = 10
    one[3] = 20
    
    println(one[0])
    println(one[3])
    
    var one1 = Array<Int>(4){0}
    one1[0] = 10
    println(one1[0])
}


2차원 배열 선언
var 배열명 = Array<배열 데이터 형식>(행 개수, {배열 데이터 형식(열 개수)})

var 배열명 = Array<데이터 형식>(개수) {초깃값}

fun main() {
	var two = Array<IntArray>(3,{IntArray(4)})
    two[0][0] = 100
    two[2][3] = 200
    
    println(two[0][0])
    println(two[2][3])
}

//java
int [][] two = new int[3][4];
for(int i=0; i<two.length; i++)	//행에 길이가 된다. 바깥쪽 for문이 행
	for(int j=0; j<two[i].length; j++){
		println("출력문");
	
}

fun main() {
    var one = Array<Int>(4,{0})
    one[0] = 10
    one[3] = 20
   	for(i in one.indices){
        println(one[i])
    }
   	var two = Array<IntArray>(3,{IntArray(4,{0})})	// 중괄호 안에 초깃값 초깃값 자리에 intArray를 넣으면 2차원 배열이 된다. 그 안에 중괄호는 초깃값
    //3행 4열의 2차원 배열
    //row의  index: 0~2
    //col의 index: 0~3

    two[1][2] = 100
    two[2][3] = 100

    for(i in two.indices){	
        for(j in two[i].indices){
               println(two[i][j])
        }
    }
	//자바 for( num : ArrayList)이렇게 쓰는 것과 동일하다
    for((i,row) in two.withIndex()){	
	//행과 열에대한 객체를 사용하고 싶다면. withIndex가 자바에서 length를 의미한다. 
	//two는 2차원 배열 행 전체를 가르키고 있음 
	//.withIndex() 한 행에대한 정보를 받을 수 있다. 
	//(i,row) withIndex가 i값과 row 참조값이 들어오게 된다. i(번호와)row(번호에 해당하는 two의 객체 참조값을 가지고 있다)

            for((j,col)in row.withIndex()){
	//j에는 열에 처음 시작번호와, col에는 행에 0렬에 있는 값이 들어가게 된다.	
            println("($i,$j) =$col\t")	//총 12번을 반복하는 반복문이 된다. 변수명을 
        }
        println()
    }
    
}

    var three : intArray = intArrayOf(1,2,3)	//배열 선언과 동시에 값을 할당할 수 있다.
}


//배열을 사용하여 두 수의 합을 구하자.
fun main(){
    
    var one = ArrayList<Int>(4)
    one.add(10)
    one.add(20)
    var sum = one.get(0) + one.get(1)
    println(sum)// 두 수의 합을 구한다.
    
}
