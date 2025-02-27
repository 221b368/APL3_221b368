import java.util.*;

public class EagerLoadingExample {
    public static void main(String[] args) {
        ParentEntity parent = loadParentWithChildren();
        System.out.println("Parent: " + parent.getName());
        for (ChildEntity child : parent.getChildren()) {
            System.out.println("Child: " + child.getName());
        }
    }

    private static ParentEntity loadParentWithChildren() {
        // Simulate eager loading
        ParentEntity parent = new ParentEntity("Parent1");
        parent.getChildren().add(new ChildEntity("Child1"));
        parent.getChildren().add(new ChildEntity("Child2"));
        return parent;
    }
}

class ParentEntity {
    private String name;
    private List<ChildEntity> children = new ArrayList<>();

    public ParentEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<ChildEntity> getChildren() {
        return children;
    }
}

class ChildEntity {
    private String name;

    public ChildEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
