package ro.ulbs.paradigme.lab2.doublechained;

import ro.ulbs.paradigme.lab2.api.Node;

public class DoubleChainedNode implements Node
{
    private int value;
    private DoubleChainedNode nextNode;
    private DoubleChainedNode prevNode;

    public DoubleChainedNode(int value)
    {
        this.value = value;
        this.nextNode = null;
        this.prevNode = null;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public DoubleChainedNode getNextNode()
    {
        return nextNode;
    }

    public void setNextNode(DoubleChainedNode nextNode)
    {
        this.nextNode = nextNode;
    }

    public DoubleChainedNode getPrevNode()
    {
        return prevNode;
    }

    public void setPrevNode(DoubleChainedNode prevNode)
    {
        this.prevNode = prevNode;
    }
}
