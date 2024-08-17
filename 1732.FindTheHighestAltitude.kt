//https://leetcode.com/problems/find-the-highest-altitude/description
fun largestAltitude(gain: IntArray): Int {
        var maxAltitude = 0
        var altitude = 0
        for(g in gain){
            altitude += g
            maxAltitude = maxOf(maxAltitude, altitude)
        }
        return maxAltitude
    }
