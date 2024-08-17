
//https://leetcode.com/problems/asteroid-collision/description
fun asteroidCollision(asteroids: IntArray): IntArray {
    val stack = Stack<Int>()

    for (asteroid in asteroids) {
        var isCollide = false
        while (stack.isNotEmpty() && asteroid < 0 && stack.last() > 0) {
            val top = stack.last()
            if (top < -asteroid) {
                stack.pop()
            } else if (top == -asteroid) {
                stack.pop()
                isCollide = true
                break
            } else {
                isCollide = true
                break
            }
        }
        if (!isCollide) {
            stack.push(asteroid)
        }

    }
    return stack.toIntArray()
}
