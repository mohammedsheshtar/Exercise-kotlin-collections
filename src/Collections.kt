fun main() {
    // part 1
    println("Part 1:");
    val fruits = mutableListOf("Green Apple", "Blueberry", "Banana");
    fruits.add("Strawberry");
    fruits.remove(fruits[1]);
    println("[*] " + fruits);

    // part 2
    println("\nPart 2:");
    val dupNums = mutableSetOf(1, 2, 3, 3, 4, 5, 5);
    dupNums.add(3);
    dupNums.add(6);
    println("[*] " + dupNums);

}