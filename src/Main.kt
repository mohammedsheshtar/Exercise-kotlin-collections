fun main() {
    val numArr = arrayOf(1, 2, 3, 4, 5);
    println(numArr.size);
    println(numArr.sum());
    println(numArr.average());
    println(numArr);
    println(numArr[2]);
    //println("--------------------------");
    val numList = intArrayOf(1, 2, 3, 4, 5);
    println(numList.size);
    println(numList);

    val emptyArr = Array(4) {0};
    println(emptyArr.joinToString(separator = ", " ));
    println(emptyArr.contentToString());

    val numArrs = arrayOf(10, 20, 30, 40, 50);
    val numArrsSum = numArrs.sum();
    val numArrsAvg = numArrs.average();
    println("sum of num arrays: $numArrsSum");
    println("avg of num arrays: $numArrsAvg");
    println(numArrs.joinToString(separator = ", "));

    val listOfNames = mutableListOf("Ali", "Hassan", "Zain", "Omar", "Sara", "Nour");
    val listOfNamesSorted = listOfNames.sorted();
    println(listOfNamesSorted);
    val listOfNamesWA = listOfNames.filter { it.startsWith("A") };
    println(listOfNamesWA);

    val numLists = listOf(1, 2, 3, 4, 5);
    val multLists = numLists.map {it * 2};
    println(multLists);

    val grades = mapOf("Ali" to 85, "Hassan" to 92, "Zain" to 78, "Omar" to 89)
    println(grades["Hassan"]);
    val aboveB = grades.filter {it.value > 80};
    println(aboveB);





}