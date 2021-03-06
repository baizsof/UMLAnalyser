package uml.diagrams.umlclass;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import uml.metaclasses.Classifier;
import uml.metaclasses.Visibility;
import uml.metaclasses.feature.BehavioralFeature;
import uml.metaclasses.feature.StructuralFeature;
import uml.metaclasses.relationship.association.BinaryAssociation;
import uml.metaclasses.relationship.directed.Dependency;
import uml.metaclasses.relationship.directed.Generalization;

import java.util.ArrayList;
import java.util.List;

public class Interface implements Classifier {
    private String id;
    private String name;
    private boolean isLeaf;
    private Visibility visibility;
    private List<Operation> operations;
    private List<Attribute> attributes;
    private List<Generalization> generalizations;
    private List<Dependency> dependencies;

    public Interface(String id, String name, boolean isLeaf, Visibility visibility, List<Operation> operations, List<Attribute> attributes, List<Generalization> generalizations, List<Dependency> dependencies) {
        this.id = id;
        this.name = name;
        this.isLeaf = isLeaf;
        this.visibility = visibility;
        this.operations = operations;
        this.attributes = attributes;
        this.generalizations = generalizations;
        this.dependencies = dependencies;
    }


    @Override
    public boolean checkIsAbstract() {
        return true;
    }

    @Override
    public List<StructuralFeature> getStructuralFeatures() {
        return new ArrayList<>(attributes);
    }

    @Override
    public List<BehavioralFeature> getBehaviorFeatures() {
        return new ArrayList<>(operations);
    }

    @Override
    public List<BinaryAssociation> getBinaryAssocations() {
        throw new NotImplementedException();
    }

    @Override
    public List<Generalization> getGeneralizations() {
        return generalizations;
    }

    @Override
    public List<Dependency> getDependencies() {
        return dependencies;
    }

    @Override
    public boolean checkIsLeaf() {
        return isLeaf;
    }

    @Override
    public String getIndentifier() {
        return id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Visibility getVisibility() {
        return visibility;
    }

    @Override
    public String toString() {
        return "Interface{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", isLeaf=" + isLeaf +
                ", visibility=" + visibility +
                ", operations=" + operations +
                ", attributes=" + attributes +
                ", generalizations=" + generalizations +
                ", dependencies=" + dependencies +
                '}';
    }
}
