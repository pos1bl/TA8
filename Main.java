public class Main {
    public static void main(String[] args)
    {
        HashTable<Double, Double> map = new HashTable<>();
        HashTable<Double, Double> map1 = new HashTable<>();
        HashTable<Double, Double> map10 = new HashTable<>();
        HashTable<Double, Double> map20 = new HashTable<>();
        AVLTree avlTree = new AVLTree();
        AVLTree avlTree1 = new AVLTree();
        AVLTree avlTree10 = new AVLTree();
        AVLTree avlTree20 = new AVLTree();
        long timeToInsert1 = System.nanoTime();
        for(int i = 0; i<=1000; i++){
            avlTree.root = avlTree.add(avlTree.root, (int) (Math.random() * 100000));
        }
        System.out.println("Time to insert in Balanced BST with 1.000 elements: " +
                (System.nanoTime() - timeToInsert1) + "ns");
        long timeToSearch1 = System.nanoTime();
        for(int i = 0; i<=1000; i++){
            avlTree.get((int) (Math.random() * 100000));
        }
        System.out.println("Time to search in Balanced BST with 1.000 elements: " +
                (System.nanoTime() - timeToSearch1) + "ns");
        long timeToInsert2 = System.nanoTime();
        for(int i = 0; i<=1000; i++){
            map.add(Math.random() * 100000, Math.random() * 100000);
        }
        System.out.println("Time to insert in HashTable with 1.000 elements: " +
                (System.nanoTime() - timeToInsert2) + "ns");

        long timeToSearch2 = System.nanoTime();
        for(int i = 0; i<=1000; i++){
            map.get(Math.random() * 100000);
        }
        System.out.println("Time to search in HashTable with 1.000 elements: " +
                (System.nanoTime() - timeToSearch2) + "ns");
        long timeToInsert11 = System.nanoTime();
        for(int i = 0; i<=10000; i++){
            avlTree1.root = avlTree1.add(avlTree1.root, (int) (Math.random() * 100000));
        }
        System.out.println("Time to insert in Balanced BST with 10.000 elements: " +
                (System.nanoTime() - timeToInsert11) + "ns");
        long timeToSearch11 = System.nanoTime();
        for(int i = 0; i<=10000; i++){
            avlTree1.get((int) (Math.random() * 100000));
        }
        System.out.println("Time to search in Balanced BST with 10.000 elements: " +
                (System.nanoTime() - timeToSearch11) + "ns");
        long timeToInsert21 = System.nanoTime();
        for(int i = 0; i<=10000; i++){
            map1.add(Math.random() * 100000, Math.random() * 100000);
        }
        System.out.println("Time to insert in HashTable with 10.000 elements: " +
                (System.nanoTime() - timeToInsert21) + "ns");
        long timeToSearch21 = System.nanoTime();
        for(int i = 0; i<=10000; i++){
            map1.get(Math.random() * 100000);
        }
        System.out.println("Time to search in HashTable with 10.000 elements: " +
                (System.nanoTime() - timeToSearch21) + "ns");
        long timeToInsert111 = System.nanoTime();
        for(int i = 0; i<=100000; i++){
            avlTree10.root = avlTree10.add(avlTree10.root, (int) (Math.random() * 100000));
        }
        System.out.println("Time to insert in Balanced BST with 100.000 elements: " +
                (System.nanoTime() - timeToInsert111) + "ns");
        long timeToSearch111 = System.nanoTime();
        for(int i = 0; i<=100000; i++){
            avlTree10.get((int) (Math.random() * 100000));
        }
        System.out.println("Time to search in Balanced BST with 100.000 elements: " +
                (System.nanoTime() - timeToSearch111) + "ns");
        long timeToInsert211 = System.nanoTime();
        for(int i = 0; i<=100000; i++){
            map10.add(Math.random() * 100000, Math.random() * 100000);
        }
        System.out.println("Time to insert in HashTable with 100.000 elements: " +
                (System.nanoTime() - timeToInsert211) + "ns");
        long timeToSearch211 = System.nanoTime();
        for(int i = 0; i<=100000; i++){
            map10.get(Math.random() * 100000);
        }
        System.out.println("Time to search in HashTable with 100.000 elements: " +
                (System.nanoTime() - timeToSearch211) + "ns");
        long timeToInsert112 = System.nanoTime();
        for(int i = 0; i<=200000; i++){
            avlTree20.root = avlTree20.add(avlTree20.root, (int) (Math.random() * 100000));
        }
        System.out.println("Time to insert in Balanced BST with 200.000 elements: " +
                (System.nanoTime() - timeToInsert112) + "ns");
        long timeToSearch112 = System.nanoTime();
        for(int i = 0; i<=200000; i++){
            avlTree20.get((int) (Math.random() * 100000));
        }
        System.out.println("Time to search in Balanced BST with 200.000 elements: " +
                (System.nanoTime() - timeToSearch112) + "ns");
        long timeToInsert212 = System.nanoTime();
        for(int i = 0; i<=200000; i++){
            map20.add(Math.random() * 100000, Math.random() * 100000);
        }
        System.out.println("Time to insert in HashTable with 200.000 elements: " +
                (System.nanoTime() - timeToInsert212) + "ns");
        long timeToSearch212 = System.nanoTime();
        for(int i = 0; i<=200000; i++){
            map20.get(Math.random() * 100000);
        }
        System.out.println("Time to search in HashTable with 200.000 elements: " +
                (System.nanoTime() - timeToSearch212) + "ns");
    }
}
