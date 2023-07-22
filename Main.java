import java.util.ArrayList;
import java.util.List;

class Worker {
    private String name;
    private String skills;

    public Worker(String name, String skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public String getSkills() {
        return skills;
    }
}

class Job {
    private String title;
    private String description;
    private double wage;
    private String postedBy;
    private Worker assignedTo;

    public Job(String title, String description, double wage, String postedBy) {
        this.title = title;
        this.description = description;
        this.wage = wage;
        this.postedBy = postedBy;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getWage() {
        return wage;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public Worker getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Worker assignedTo) {
        this.assignedTo = assignedTo;
    }
}

class JobPlatform {
    private List<Job> jobs;
    private List<Worker> workers;

    public JobPlatform() {
        jobs = new ArrayList<>();
        workers = new ArrayList<>();
    }

    public void addJob(Job job) {
        jobs.add(job);
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public List<Worker> getWorkers() {
        return workers;
    }
}

public class Main {
    public static void main(String[] args) {
        JobPlatform platform = new JobPlatform();

        Worker worker1 = new Worker("John Doe", "Carpentry");
        Worker worker2 = new Worker("Jane Smith", "Plumbing");

        platform.addWorker(worker1);
        platform.addWorker(worker2);

        Job job1 = new Job("Carpenter Needed", "Looking for a skilled carpenter.", 20.0, "ABC Construction");
        Job job2 = new Job("Plumber Wanted", "Need a plumber for a bathroom renovation.", 18.0, "XYZ Plumbing");

        platform.addJob(job1);
        platform.addJob(job2);

        job1.setAssignedTo(worker1);
        job2.setAssignedTo(worker2);

        // Generating HTML output
        StringBuilder htmlOutput = new StringBuilder();
        htmlOutput.append("<!DOCTYPE html>\n");
        htmlOutput.append("<html>\n");
        htmlOutput.append("<head>\n");
        htmlOutput.append("    <title>Job Listings</title>\n");
        htmlOutput.append("</head>\n");
        htmlOutput.append("<body>\n");
        htmlOutput.append("    <h1>Job Listings</h1>\n");

        List<Job> jobs = platform.getJobs();
        for (Job job : jobs) {
            htmlOutput.append("    <h2>").append(job.getTitle()).append("</h2>\n");
            htmlOutput.append("    <p>Job Description: ").append(job.getDescription()).append("</p>\n");
            htmlOutput.append("    <p>Wage: $").append(job.getWage()).append("</p>\n");
            htmlOutput.append("    <p>Posted By: ").append(job.getPostedBy()).append("</p>\n");
            if (job.getAssignedTo() != null) {
                htmlOutput.append("    <p>Assigned To: ").append(job.getAssignedTo().getName()).append("</p>\n");
            }
        }

        htmlOutput.append("</body>\n");
        htmlOutput.append("</html>\n");

        System.out.println(htmlOutput.toString());
    }
}
