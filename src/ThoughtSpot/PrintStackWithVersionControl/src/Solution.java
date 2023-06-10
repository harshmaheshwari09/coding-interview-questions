package ThoughtSpot.PrintStackWithVersionControl.src;

import ThoughtSpot.PrintStackWithVersionControl.src.CustomStack;
import ThoughtSpot.PrintStackWithVersionControl.src.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    int currentVersion;
    Map<Integer, Node> snapshotMap;
    CustomStack stack;

    public Solution() {
        this.currentVersion = 0;
        this.snapshotMap = new HashMap<>() {{
            put(0, null);
        }};
        this.stack = new CustomStack();
    }

    public void push(int value) {
        Node snapshot = this.stack.push(value);
        this.snapshotMap.put(++currentVersion, snapshot);
    }

    public void pop() {
        Node snapshot = this.stack.pop();
        this.snapshotMap.put(++currentVersion, snapshot);
    }

    public List<Integer> print(int snapshotVersion) throws Exception {
        if (!this.snapshotMap.containsKey(snapshotVersion)) {
            throw new Exception(String.format("snapshot version %d is not present", snapshotVersion));
        }
        Node snapshot = this.snapshotMap.get(snapshotVersion);
        List<Integer> snapshotValues = new ArrayList<>();
        while (snapshot != null) {
            snapshotValues.add(snapshot.getValue());
            snapshot = snapshot.getNext();
        }
        return snapshotValues;
    }
}
