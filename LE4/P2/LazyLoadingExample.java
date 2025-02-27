import java.util.*;
public class LazyLoadingExample {
    public static void main(String[] args) {
        // Loading data lazily
        ParentEntityLazy parent = loadParent();
        System.out.println("Parent: " + parent.getName());
        // Children are loaded only when accessed
        for (ChildEntityLazy child : parent.getChildren()) {
            System.out.println("Child: " + child.getName());
        }
    }

    private static ParentEntityLazy loadParent() {
        // Simulate lazy loading
        return new ParentEntityLazy("Parent1");
    }
}

class ParentEntityLazy {
    private String name;
    private List<ChildEntityLazy> children;

    public ParentEntityLazy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<ChildEntityLazy> getChildren() {
        // Load children only when accessed
        if (children == null) {
            children = new ArrayList<>();
            children.add(new ChildEntityLazy("Child1"));
            children.add(new ChildEntityLazy("Child2"));
        }
        return children;
    }
}

class ChildEntityLazy {
    private String name;

    public ChildEntityLazy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
