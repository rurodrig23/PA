package gestorTasques;
import java.io.*;
import java.text.ParseException;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;

class Task 
{
    
    private int id;
	private String title;
    private String description;
    private Date dueDate;
    private String status;

	public Task(String title, String description, java.sql.Date date, String status) throws ParseException {
        this.title = title;
        this.description = description;
        this.dueDate =  dueDate;
        this.status = status;
    }

   

    public int getId() {
        return id;
    }

	public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String dueDate() {
        return new SimpleDateFormat("dd/MM/yyyy").format(dueDate);
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
    
        return title + "," + description + "," + status;
    }
}