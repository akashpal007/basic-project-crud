package basicprojectcrud.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class HiiHelloScheduler {
//	https://docs.spring.io/spring/docs/3.2.x/spring-framework-reference/html/scheduling.html#scheduling-annotation-support
//	https://www.freeformatter.com/cron-expression-generator-quartz.html
//	@Scheduled(fixedDelay = 5000)
	@Scheduled(fixedDelay = 1 * 1000, initialDelay = 3 * 1000)
//	@Scheduled(fixedRate = 1000)
//	Fixed Delay scheduler is used to execute the tasks at a specific time. It should wait for the previous task completion.
//	InitialDelay is the time after which the task will be executed the first time after the initial delay value.
//	In the above example to execute the task for every second after 3 seconds from the application startup.
//	Fixed Rate scheduler is used to execute the tasks at the specific time. It does not wait for the completion of previous task.
	public void printSchedulerTime() {
		Date date = new Date();
//		String strDateFormat = "hh:mm:ss a";//for 12 hour format
//		String strDateFormat = "HH:mm:ss";//for 24 hour format
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		String formattedDate = dateFormat.format(date);
		System.out.println("Time - " + formattedDate);
	}

	@Scheduled(cron = "0 0 0 * * ?")//Run every day at 00:00
	public void printSchedulerDate() {
		DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Date - " + dateFormat1.format(new Date()));
		
		DateFormat dateFormat2 = new SimpleDateFormat("dd/MMMM/yyyy");
		System.out.println("Date - " + dateFormat2.format(new Date()));
	}
}
