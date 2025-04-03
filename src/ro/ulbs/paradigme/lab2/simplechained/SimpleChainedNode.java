package ro.ulbs.paradigme.lab2.simplechained;

import ro.ulbs.paradigme.lab2.api.Node;

public class SimpleChainedNode implements Node
{
    private int value;
    private SimpleChainedNode nextNode;

    public SimpleChainedNode(int value)
    {
        this.value = value;
        this.nextNode = null;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public SimpleChainedNode getNextNode()
    {
        return nextNode;
    }

    public void setNextNode(SimpleChainedNode nextNode)
    {
        this.nextNode = nextNode;
    }
}
