package foo;

import java.util.*;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;

public class ChildrenSimpleVM {
	private List<Child> Nodes = new ArrayList<Child>();
	
	public ChildrenSimpleVM() {
		Nodes.add(new Child("Item A"));
		Nodes.add(new Child("Item B"));
		Nodes.add(new Child("Item C"));
	}
	
	public List<Child> getNodes() {
		return Nodes;
	}
	
	@Command
	@NotifyChange("nodes")
	public void cmd() {
		Nodes.add(new Child("Item " + (char)(Nodes.size()+65)));
	}
	
}
