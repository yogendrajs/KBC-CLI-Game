import java.util.Scanner;
class kbc {
	public static void main(String[] args) {
		Scanner variable = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Welcome to KBC!");
		System.out.println("You can press q to quit anytime");
		System.out.println();
		int i = 0;
		String[] questions = {"1. The weight of diamonds is usually measured in what?", "2. Which state of India has the shortest coastline?", "3. Who is the first Indian woman wrestler to win a gold medal at the Asian Games?", "4. Which of these viruses takes it's name from a place in Malaysia?", "5. Which of these planets has a solid surface?", "6. Which of these banks was founded in Lahore in the 19th century?"};
		String[] option1 = {"1. Tola", "1. Goa", "1. Sakshi Malik", "1. Nipah","1. Mars", "1. Punjab & Sindh Bank"};
		String[] option2 = {"2. Carat", "2. Maharashtra", "2. Babita Kumari", "2. Ebola", "2. Saturn", "2. Punjab National Bank"};
		String[] option3 = {"3. Maund", "3. Odisha", "3. Vinesh Phogat", "3. Influenza", "3. Jupiter", "3. UCO Bank"};
		String[] option4 = {"4. Troy", "4. West Bengal", "4. Kavita Devi", "4. HIV", "4. Uranus", "4. Dena Bank"};

		// String[] options = {option1, option2, option3, option4};

		String[] answers = {"1", "1", "3", "1", "1", "2"};
		int[] reward = {1000, 2000, 5000, 10000, 20000, 30000};
		while (i < questions.length){
			System.out.println(questions[i]);
			System.out.println(option1[i]);
			System.out.println(option2[i]);
			System.out.println(option3[i]);
			System.out.println(option4[i]);
			System.out.println();
			System.out.print("select an option: ");
			String input = variable.nextLine();
			if (input.equals("quit") || input.equals("q")){System.out.println("You've been quit. Thank You!");break;}
			else if(answers[i].equals(input)){
				System.out.println("Awesome! You're right ;)");
				System.out.println("You've won Rs." + reward[i]);
				if (i < (questions.length-1)){
					System.out.println("Let's move on to next question :)");
					if (i == 2){System.out.println("you've finished your first step");}
					System.out.println();
				}i++;
			}else{
				System.out.println("You're wrong :( \n better luck next Time :|");
				break;
			}
		}
	}
}
