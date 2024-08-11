class Solution {
    fun simplifyPath(path: String): String {
        val splitArr = path.split("/")
        val stack = Stack<String>()

        for(str in splitArr){
            if(!stack.isEmpty() && str == ".."){
                stack.pop()
            } else if(str.isNotEmpty() && str != "." && str != ".."){
                stack.push(str)
            }
        }

        // val sb = StringBuilder()
        // for(str in stack){
        //     sb.append("/")
        //     sb.append(str)
        // }
        return "/" + stack.joinToString("/")
    }
}
