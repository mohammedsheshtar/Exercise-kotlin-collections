fun main() {
    // part 1
    println("Part 1:");
    val fruits = mutableListOf("Green Apple", "Blueberry", "Banana");
    fruits.add("Strawberry");
    fruits.remove(fruits[1]);
    println("[*] " + fruits);

}