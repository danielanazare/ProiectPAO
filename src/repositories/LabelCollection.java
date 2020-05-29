package repositories;

import model.Label;

import java.util.HashSet;
import java.util.Set;

public class LabelCollection {
    private Set<Label> labelCollection = new HashSet<Label>();

    public void add(Label label) {
        labelCollection.add(label);
    }
    public void addAll(Set<Label> labels) {
        labelCollection.addAll(labels);
    }
}
