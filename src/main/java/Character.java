class Character implements Runnable {
    public void run() {
        char i;
        for (i = 'A'; i <= 'Z'; i++) {
            System.out.printf("\n%c", i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


