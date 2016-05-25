package kz.alisher.reminder.dto;

/**
 * Created by Alisher Kozhabay on 25.05.2016.
 */
public class RemindDTO {
    private String title;

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
