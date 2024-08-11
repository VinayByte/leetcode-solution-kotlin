fun reverseWords(s: String): String {
    if (s.isEmpty()) return ""
    val split = s.split(" ")
    if (split.isEmpty()) return ""
    val sb = StringBuilder()
    for (i in split.size - 1 downTo 0) {
        if (split[i].isNotEmpty()) {
            sb.append(" " + split[i])
        }
    }
    return sb.toString().trim()
}
