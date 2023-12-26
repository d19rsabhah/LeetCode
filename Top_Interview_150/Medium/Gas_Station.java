package Top_Interview_150.Medium;

public class Gas_Station {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int ts = 0;
        int sp = 0;
        int s = 0;
        for (int i = 0; i < n; i++) {
            ts += gas[i] - cost[i];
            sp += gas[i] - cost[i];
            if (sp < 0) {
                sp = 0;
                s = i + 1;
            }
        }
        return (ts < 0) ? -1 : s;
    }
}
