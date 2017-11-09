package Curs8_9;

/**
 * Created by Mihnea on 09.11.2017.
 */
public class MyLinkedList {
    private Node prim;

    public void add(int el, int poz) {
        Node nodNou = new Node();
        nodNou.elem = el;
        nodNou.urm = null;

        if (poz == 0) {
            nodNou.urm = this.prim;
            this.prim = nodNou;
        } else {
            Node nodCurent;
            int pozCurent = 0;
            nodCurent = this.prim;
            while (pozCurent < poz - 1 && nodCurent != null) {
                nodCurent = nodCurent.urm;
                pozCurent++;
            }
            if (pozCurent == poz - 1 && nodCurent != null) {
                nodNou.urm = nodCurent.urm;
                nodCurent.urm = nodNou;
            }
        }
    }

    public void addBegin(int el) {
        Node nodNou = new Node();
        nodNou.elem = el;
        nodNou.urm = null;

        if (this.prim == null) {
            this.prim = nodNou;
        } else {
            nodNou.urm = this.prim;
            this.prim = nodNou;
        }
    }

    public void addEnd(int el) {
        Node nodNou = new Node();
        nodNou.elem = el;
        nodNou.urm = null;

        if (this.prim == null) {
            this.prim = nodNou;
        } else {
            Node nodCurent = new Node();
            nodCurent = this.prim;
            while (nodCurent.urm != null) {
                nodCurent = nodCurent.urm;
            }
            nodCurent.urm = nodNou;
        }
    }


    public void delete(int poz) {
        if (this.prim != null) {
            if (poz == 0) {
                this.prim = this.prim.urm;
            } else {
                Node nodCurent = this.prim;
                int pozCurent = 0;

                while (pozCurent < poz - 1 && nodCurent != null) {
                    nodCurent = nodCurent.urm;
                    pozCurent++;
                }

                if (pozCurent == poz - 1 && nodCurent != null && nodCurent.urm != null) {
                    nodCurent.urm = nodCurent.urm.urm;
                }
            }
        }
    }

    public void deleteBegin() {
        if (this.prim != null) {
            this.prim = this.prim.urm;
        }
    }

    public void deleteEnd() {
        if (this.prim != null) {
            if (this.prim.urm == null) {
                this.prim = null;
            } else {
                Node nodCurent = this.prim;
                while (nodCurent.urm.urm != null) {
                    nodCurent = nodCurent.urm;
                }
                nodCurent.urm = null;
            }
        }
    }

    public int get(int poz) {
        if (poz >= 0) {
            Node nodCurent = this.prim;
            int pozCurent = 0;

            while (pozCurent < poz && nodCurent != null) {
                poz++;
                nodCurent = nodCurent.urm;
            }

            if (nodCurent != null) {
                return nodCurent.elem;
            }
        }
        return Integer.MIN_VALUE;
    }

    public boolean searchFor(int elem) {
        Node nodCurent = prim;
        boolean found = false;
        while (!found && nodCurent != null) {
            if (nodCurent.elem == elem) {
                found = true;
            } else {
                nodCurent = nodCurent.urm;
            }
        }
        return found;
    }

    @Override
    public String toString() {
        Node node = prim;
        StringBuilder str = new StringBuilder();
        str.append("[");
        while (node != null) {
            str.append(node.elem).append(", ");
            node = node.urm;
        }
        str.deleteCharAt(str.length() - 2).deleteCharAt(str.length() - 1);
        str.append("]");
        return str.toString();

    }

    public class Node {
        private int elem;
        private Node urm;
    }
}
