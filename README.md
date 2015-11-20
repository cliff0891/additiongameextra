# Addition Game using  methods and for loops
Writing an addition game using methods, for loops and array.The user will be asked a simple math problem in the first round. For example, to add two single digit numbers. If the user gets this correct, they will be given points and asked a more difficult math problem in round 2, such as adding a pair of two digit numbers. They will receive more points and be asked more difficult questions in the following round for every correct answer. Every incorrect answer will be followed by a more simple question. There should be a total of 4 rounds. At the end of 4 rounds, the code should print the final score.

## Outline
```
//import java.util.Scanner;
//Create variables used throughout the code
//use the boolean data to verify the answer
// use array to sort numbers
//use the If statement to determine correct or incorrect answer.
//If the answer is correct, increase the score by 10, else if incorrect, leave it alone and continue to the next round
//use print statement after the final round to print output score
```

## References and Literature
* Liang, Y. (2014). Introduction to Java programming: Comprehensive version (Tenth ed.). 
* 2.3 Reading Input from the Console. pg. 37 .Liang, Y. (2014). Introduction to Java programming: Comprehensive version (Tenth ed.).

## Code
``` java 
package additionGameExtra;

import java.util.Scanner;

public class additiongameextra {

	public static void main(String[] args) {
		//System.out.println("Hello class.");
		
		//Call the addition game method.
		AdditonGameMethod();
	}
	public static void AdditonGameMethod() {
		//System.out.println("Inside the addition game method.");
		
		int[] gameVariables = new int[4];
		gameVariables[0] = 5; //hardness;
		//int hardness = gameVariables[0];
		gameVariables[1] = 2; //hardnessStep;
		//int hardnessStep = 2;
		gameVariables[2] = 0; //score;
		//int score = 0;
		gameVariables[3] = 0; // 1 for true, 0 for false
		
		// Set up my for loop to go through the number of rounds
		int numberOfRounds = 3;
		for(int roundNumber = 1; 
		roundNumber <= numberOfRounds;  
		roundNumber = roundNumber + 1){
			//System.out.println("Inside the for loop. Round: " + roundNumber);
			System.out.print("Round " + roundNumber + " of " + numberOfRounds + ". ");
			gameVariables = getAndCheckStudentAnswer(gameVariables);
			if(gameVariables[3] == 1){
				System.out.print("Your score was " + gameVariables[2] + " and is now ");
				gameVariables[2] = gameVariables[2] + gameVariables[0];
				System.out.print(gameVariables[2] + ". ");
				
				if(roundNumber<numberOfRounds){
					System.out.print("Your hardness was " + gameVariables[0] + " and is now ");
					gameVariables[0] = gameVariables[0] * gameVariables[1];
					System.out.println(gameVariables[0] + ".");
				}
			}else{
				System.out.print("Your score is " + gameVariables[2] + ". ");
				if(roundNumber<numberOfRounds){
					System.out.print("Your hardness was " + gameVariables[0] + " and is now ");
					if(gameVariables[0]>5){
						gameVariables[0] = gameVariables[0] / gameVariables[1];
					}
					System.out.println(gameVariables[0] + ".");
					
				}
				
			}
		}
		System.out.print("\nThe game is complete. ");
		System.out.println("Your final score was " + gameVariables[2] );
	}
	
	public static int[] getAndCheckStudentAnswer(int[] gameVariables) {
		//System.out.println("Inside get and check student answer method.");
		int number1 = (int)(Math.random()*gameVariables[0]);
		int number2 = (int)(Math.random()*gameVariables[0]);
		System.out.print("Add " + number1 + " and " + number2 +": ");
		//Scanner input = new Scanner(System.in);
		//int studentAnswer = input.nextInt();
		Scanner get = new Scanner(System.in);
		int studentAnswer = get.nextInt();
		if(studentAnswer == (number1 + number2)){
			System.out.print("Correct. ");
			gameVariables[3] = 1;
			
		}else{
			System.out.println("Nice try, but the correct answer was " 
					+ (number1 + number2) + ".");
			gameVariables[3] = 0;
		}
		return gameVariables;
	}
}
```
## Command prompt

76054_n.jpg
01/05/2015  04:13 PM           497,101 1506336_216039838583295_1045764802_o.jpg
01/05/2015  04:13 PM            65,835 10686647_300680306785914_5558296860754913
494_n.jpg
11/08/2015  02:23 PM    <DIR>          persuasive speech
              22 File(s)      2,231,615 bytes
              19 Dir(s)  459,680,776,192 bytes free

D:\>cd comsc\additiongameextra

D:\COMSC\additionGameExtra>echo # additiongameextra >> README.md

D:\COMSC\additionGameExtra>git init
Initialized empty Git repository in D:/COMSC/additionGameExtra/.git/

D:\COMSC\additionGameExtra>git add README.md

D:\COMSC\additionGameExtra>git commit -m "first commit"

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: empty ident name (for <User@AHL100I.(none)>) not allowed

D:\COMSC\additionGameExtra>git config user.name "cliff0891"

D:\COMSC\additionGameExtra>git config user.email yuyunc@student.swosu.edu

D:\COMSC\additionGameExtra>git commit -m "first commit"
[master (root-commit) 13ee810] first commit
 1 file changed, 1 insertion(+)
 create mode 100644 README.md

D:\COMSC\additionGameExtra>git remote add origin https://github.com/cliff0891/ad
ditiongameextra.git

D:\COMSC\additionGameExtra>git push -u origin master
Username for 'https://github.com': cliff0891
Password for 'https://cliff0891@github.com':
Counting objects: 3, done.
Writing objects: 100% (3/3), 235 bytes | 0 bytes/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/cliff0891/additiongameextra.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.

D:\COMSC\additionGameExtra>git add .

D:\COMSC\additionGameExtra>git commit -m "started my code"
[master a57e0ad] started my code
 4 files changed, 44 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 bin/additionGameExtra/additiongameextra.class
 create mode 100644 src/additionGameExtra/additiongameextra.java

D:\COMSC\additionGameExtra>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': cliff0891
Password for 'https://cliff0891@github.com':
Counting objects: 10, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (8/8), done.
Writing objects: 100% (10/10), 1.64 KiB | 0 bytes/s, done.
Total 10 (delta 0), reused 0 (delta 0)
To https://github.com/cliff0891/additiongameextra.git
   13ee810..a57e0ad  master -> master

D:\COMSC\additionGameExtra>git checkout dev -b
error: switch `b' requires a value
usage: git checkout [<options>] <branch>
   or: git checkout [<options>] [<branch>] -- <file>...

  


D:\COMSC\additionGameExtra>git branch dev

D:\COMSC\additionGameExtra>git checkout dev
Switched to branch 'dev'

D:\COMSC\additionGameExtra>git add .

D:\COMSC\additionGameExtra>git commit -m "modified my code"
On branch dev
nothing to commit, working directory clean

D:\COMSC\additionGameExtra>git add .

D:\COMSC\additionGameExtra>git commit -m "added a line"
[dev f92b4f6] added a line
 2 files changed, 106 insertions(+), 21 deletions(-)
 rewrite src/additionGameExtra/additiongameextra.java (65%)

D:\COMSC\additionGameExtra>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

fatal: The current branch dev has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin dev


D:\COMSC\additionGameExtra> git push --set-upstream origin dev
Username for 'https://github.com': cliff0891
Password for 'https://cliff0891@github.com':
Counting objects: 8, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (6/6), done.
Writing objects: 100% (8/8), 2.95 KiB | 0 bytes/s, done.
Total 8 (delta 1), reused 0 (delta 0)
To https://github.com/cliff0891/additiongameextra.git
 * [new branch]      dev -> dev
Branch dev set up to track remote branch dev from origin.

D:\COMSC\additionGameExtra>git checkout dev11 -b
error: switch `b' requires a value
usage: git checkout [<options>] <branch>
   or: git checkout [<options>] [<branch>] -- <file>...

    
    -l                    create refl


D:\COMSC\additionGameExtra>git checkout -b dev11
Switched to a new branch 'dev11'

D:\COMSC\additionGameExtra>git add .

D:\COMSC\additionGameExtra>git commit -m "added another line"
On branch dev11
nothing to commit, working directory clean

D:\COMSC\additionGameExtra>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

fatal: The current branch dev11 has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin dev11


D:\COMSC\additionGameExtra> git push --set-upstream origin dev11
Username for 'https://github.com': cliff0891
Password for 'https://cliff0891@github.com':
Total 0 (delta 0), reused 0 (delta 0)
To https://github.com/cliff0891/additiongameextra.git
 * [new branch]      dev11 -> dev11
Branch dev11 set up to track remote branch dev11 from origin.

D:\COMSC\additionGameExtra>git checkout master
Switched to branch 'master'
Your branch is up-to-date with 'origin/master'.

D:\COMSC\additionGameExtra>git merge dev11
Updating a57e0ad..f92b4f6
Fast-forward
 bin/additionGameExtra/additiongameextra.class | Bin 823 -> 3148 bytes
 src/additionGameExtra/additiongameextra.java  | 109 +++++++++++++++++++++++---
 2 files changed, 97 insertions(+), 12 deletions(-)

D:\COMSC\additionGameExtra>git add .

D:\COMSC\additionGameExtra>git commit -m "code working"
On branch master
Your branch is ahead of 'origin/master' by 1 commit.
  (use "git push" to publish your local commits)
nothing to commit, working directory clean

D:\COMSC\additionGameExtra>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': cliff0891
Password for 'https://cliff0891@github.com':
Total 0 (delta 0), reused 0 (delta 0)
To https://github.com/cliff0891/additiongameextra.git
   a57e0ad..f92b4f6  master -> master

D:\COMSC\additionGameExtra>

## Summary
the main method calls a greeting method in the print statement and also calls the addition game method. the main method has no output and input variables. the game method has an internal variables of array called gameVariables. it	Calls the getAndCheckStudentAnswer method and Prints out the score for each round using a for loop.
First of all i want ot comment on the fact methods make our lives easier. The first addition game that i wrote was way too long because each round came with its own outline and formulas though the same things repeating over and over agian thus making it too lengthy. But using methods and for loop, it took me just a few lines and the code was done and running well. using methods makes the work easier and less time consuming because you can create the variables to use throughout your code without necessarilly reapeating them. You can also use a for loop to loop through the number of rounds defined in the beginning of the code. With for loop you don't have to repeat methods, and variables in every round.it saves time from copying and pasting all the times. 
