package streamPractise;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;


public class SummaryStatisticsDemo {

	public static void main(String[] args) {
		List<ExamData> data = new ArrayList<ExamData>() {
			{
				add(new ExamData("George", 91.3));
				add(new ExamData("Tom", 88.9));
				add(new ExamData("Rick", 80));
				add(new ExamData("Harold", 90.8));
				add(new ExamData("Ignatius", 60.9));
				add(new ExamData("Anna", 77));
				add(new ExamData("Susan", 87.3));
				add(new ExamData("Phil", 99.1));
				add(new ExamData("Alex", 84));
			}
		};
		
		
		DoubleSummaryStatistics summary = data.stream()
				.collect(Collectors.summarizingDouble(ExamData::getTestScore));
		double average = summary.getAverage();
		System.out.println("Average score : "+average);
		double lowest = summary.getMin();
		System.out.println("Lowest Score : "+lowest);
		double top = summary.getMax();
		System.out.println("Top Score : "+top);
		double sum = summary.getSum();
		System.out.println("Sum : "+sum);
		long count = summary.getCount();
		System.out.println("Count : "+count);
	}
}
