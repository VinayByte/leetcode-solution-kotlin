class Solution {
    fun predictPartyVictory(senate: String): String {
        val radiant = ArrayDeque<Int>()
        val dire = ArrayDeque<Int>() 
        for ((index, char) in senate.withIndex()) {
            if (char == 'R') {
                radiant.add(index)
            } else {
                dire.add(index)
            }
        }

        while (radiant.isNotEmpty() && dire.isNotEmpty()) {
            val radiantIndex = radiant.removeFirst()
            val direIndex = dire.removeFirst()
            if (radiantIndex < direIndex) {
                radiant.addLast(radiantIndex + senate.length)
            } else {
                dire.addLast(direIndex + senate.length)
            }
        }
        
        return if (radiant.isNotEmpty()) "Radiant" else "Dire"
    }
}
