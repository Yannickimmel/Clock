import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**     
 * this class is used to create the clock display 
 */
public class Frame extends JFrame  {
    /**
     * this variable is used to initialize the Calender
     */
    Calendar calender;
/**
 * these variable is used to initialize the SimpleDateFormats for time,day and date
 */
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
/**    
 * these variable is used to initialize the JLabels for time,day and date
 */
    JLabel timeLabel; 
    JLabel dateLabel;
    JLabel dayLabel;
/**
 * these variables is used to initialize the time,date and day
 */
    String time;
    String date;
    String day;

/**
 *  this method is used to initialize the frame
 * 
 */
Frame(){
    /** 
     * setting up the frame
     */
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Clock Display");
    this.setLayout(new FlowLayout());
    this.setSize(350,200);
     /**
      * formating for date,time and day 
      */
    timeFormat = new SimpleDateFormat("hh:mm:ss a");
    dateFormat = new SimpleDateFormat(" MMMM dd, yyyy");
    dayFormat = new SimpleDateFormat("EEEE");

/** 
 * creaing the visuals for time 
 */
    timeLabel = new JLabel();
    timeLabel.setFont(new Font("ink free", Font.BOLD, 50));
    timeLabel.setForeground(Color.black);
    //timeLabel.setBackground(Color.black);
    timeLabel.setOpaque(true);
/** 
 * creating the visuals for date
 */
    dateLabel = new JLabel();
    dateLabel.setFont(new Font("Times New Roman", Font.ITALIC, 30));
    dateLabel.setForeground(Color.black);
    //dateLabel.setBackground(Color.black);
    dateLabel.setOpaque(true);
/**
 * creating the visuals for day
 */
    dayLabel= new JLabel();
    dayLabel.setFont(new Font("Times New Roman", Font.ITALIC, 20));
    dayLabel.setForeground(Color.black);
    //dayLabel.setBackground(Color.black);
    dayLabel.setOpaque(true);
/**
 *  adding the visuals
 */
    this.add(dateLabel);
    this.add(timeLabel);
    this.add(dayLabel);

/** 
 * making the frame visible
 */
    this.setVisible(true);
/**
 * this method is used to update the time
 */
    setTime();
}
/**
 * this method is used to update the time label,date label and day label
 */
public void setTime(){
    while(true){
    time = timeFormat.format(Calendar.getInstance().getTime());
    timeLabel.setText(time); 
    
date = dayFormat.format(Calendar.getInstance().getTime());
    dateLabel.setText(date);

day = dateFormat.format(Calendar.getInstance().getTime());
    dayLabel.setText(day);
/** 
 * making the time and date change every second
 * whiule checking for errors
 */
try{
    Thread.sleep(1000);
    }
    catch(InterruptedException e){
        e.printStackTrace();
    }
}
    }
    
}

