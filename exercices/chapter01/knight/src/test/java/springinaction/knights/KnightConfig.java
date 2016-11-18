package springinaction.knights;

import java.io.PrintStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springinaction.knights.BraveKnight;
import springinaction.knights.Knight;
import springinaction.knights.Quest;
import springinaction.knights.SlayDragonQuest;

@Configuration
public class KnightConfig {

	@Bean
	public Knight knight() {
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest quest() {
		return new SlayDragonQuest(stream());
	}
	
	@Bean
	public PrintStream stream() {
		return new FakePrintStream();
	}

}
