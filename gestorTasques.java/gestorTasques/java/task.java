package gestorTasques.java;
import java.io.*;
import java.text.ParseException;
import java.util.*;

class Task 
{
    private int id;
	private String title;
    private String description;
    private String datavenc;
    private String status;

	public Task(String title, String description, String datavenc,String status) {
		this.title = title;
        this.description = description;
        this.datavenc = datavenc;
        this.status = status;
	}

	public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String datavenc() {
        return datavenc;
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