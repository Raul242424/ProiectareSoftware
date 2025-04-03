package ro.ulbs.paradigme.lab2.doublechained;

import ro.ulbs.paradigme.lab2.api.ListOrderCheck;

public class DoubleChainedList implements ListOrderCheck
{
    private DoubleChainedNode head;

    public DoubleChainedList()
    {
        this.head = null;
    }
    public void addValue(int value)
    {
        DoubleChainedNode newNode = new DoubleChainedNode(value);
        if (head == null)
        {
            head = newNode;
        }
        else
        {
            DoubleChainedNode current = head;
            while (current.getNextNode() != null)
            {
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
            newNode.setPrevNode(current);
        }
    }
    public DoubleChainedNode getNodeByValue(int value)
    {
        DoubleChainedNode current = head;
        while (current != null)
        {
            if (current.getValue() == value)
            {
                return current;
            }
            current = current.getNextNode();
        }
        return null;
    }
    public void removeNodeByValue(int value)
    {
        if (head == null) return;
        if (head.getValue() == value)
        {
            head = head.getNextNode();
            if (head != null)
            {
                head.setPrevNode(null);
            }
            return;
        }
        DoubleChainedNode current = head;
        while (current != null)
        {
            if (current.getValue() == value)
            {
                if (current.getPrevNode() != null)
                {
                    current.getPrevNode().setNextNode(current.getNextNode());
                }
                if (current.getNextNode() != null)
                {
                    current.getNextNode().setPrevNode(current.getPrevNode());
                }
                return;
            }
            current = current.getNextNode();
        }
    }
    public void listNodes()
    {
        DoubleChainedNode current = head;
        while (current != null)
        {
            System.out.print(current.getValue() + " ");
            current = current.getNextNode();
        }
        System.out.println();
    }
    public boolean isOrdered()
    {
        if (head == null) return true;
        DoubleChainedNode current = head;
        while (current.getNextNode() != null)
        {
            if (current.getValue() > current.getNextNode().getValue())
            {
                return false;
            }
            current = current.getNextNode();
        }
        return true;
    }
    public int calculateSum()
    {
        int sum = 0;
        DoubleChainedNode current = head;
        while (current != null)
        {
            sum += current.getValue();
            current = current.getNextNode();
        }
        return sum;
    }
}

