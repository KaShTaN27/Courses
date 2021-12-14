package Chapter9.Task49;

public class MyLinkedList implements NodeList{
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }
        ListItem currItem = this.root;
        while (currItem != null) {
            int compRes = currItem.compareTo(item);
            if (compRes < 0) {
                if (currItem.next() != null) {
                    currItem = currItem.next();
                } else {
                    currItem.setNext(item).setPrevious(currItem);
                    return true;
                }
            } else if (compRes > 0) {
                    if (currItem.previous() != null) {
                        currItem.previous().setNext(item).setPrevious(currItem.previous());
                        item.setNext(currItem).setPrevious(item);
                    } else {
                        item.setNext(this.root).setPrevious(item);
                        this.root = item;
                    }
                    return true;
                } else {
                    System.out.println(item.getValue() + " already exist");
                    return false;
                }

        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting" + item.getValue());
            ListItem currItem = this.root;
            while (currItem != null) {
                int compRes = currItem.compareTo(item);
                if (compRes == 0) {
                    if (currItem == this.root)
                        this.root = currItem.next();
                    else {
                        currItem.previous().setNext(currItem.next());
                        if (currItem.next() != null)
                            currItem.next().setPrevious(currItem.previous());
                    }
                    return true;
                } else if (compRes < 0) {
                    currItem = currItem.next();
                } else
                    return false;

            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null)
        while (root != null) {
            System.out.println(root.getValue());
            root = root.next();
        } else
            System.out.println("List is empty");
    }
}
