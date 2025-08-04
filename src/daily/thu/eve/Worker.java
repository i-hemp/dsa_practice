package daily.thu.eve;

public class Worker {
    private String name;
    private String workerId;

    public Worker(String name, String workerId) {
        this.name = name;
        this.workerId = workerId;
    }

    public String getName() {
        return name;
    }

    public String getWorkerId() {
        return workerId;
    }

    public void doTask(String task) {
        System.out.println(toString() + " working on : " + task);
    }

    @Override
    public String toString() {
        return "Worker [name=" + name + ", workerId=" + workerId + "]";
    }

}

// public class UseWorker {
// public static void main(String[] args) {
// Worker foo = new Worker("n", "101");
// foo.doTask("task1");

// }

// }
