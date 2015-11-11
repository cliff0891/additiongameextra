# Addition Game using  methods and for loops
Writing an addition game this using methods and for loops.The user will be asked a simple math problem in the first round. For example, to add two single digit numbers. If the user gets this correct, they will be given points and asked a more difficult math problem in round 2, such as adding a pair of two digit numbers. They will receive more points and be asked more difficult questions in the following round for every correct answer. Every incorrect answer will be followed by a more simple question. There should be a total of 4 rounds. At the end of 4 rounds, the code should print the final score.

## Outline
```
//import java.util.Scanner;
//Create variables used throughout the code
//use the boolean data to verify the answer
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

	
	
	//These are variables used throughout all methods
    public static int numberOfRounds        = 4;
    public static int score                 = 0;
    public static int hardnessOfQuestion    = 10;
    public static int correctAnswer;
    public static Scanner input             = new Scanner(System.in);

    public static void main(String[] args) {    

        for(int i=1;i<numberOfRounds+1;i++){

            outputMessage("Round " + i + ". Begin.");

            if ( correctAnswer() ){         
                outputMessage("Answer was correct.");           
                increaseScoreByHardness(hardnessOfQuestion);
                outputScore();
                increaseHardnessByFactor(10);           
            }else{
                outputMessage("Answer was not correct");            
                outputCorrectAnswer();

                if(hardnessOfQuestion>10){
                    decreaseHardnessByFactor(10);
                }
            }           

            if(i<numberOfRounds){
                outputMessage("End of round " + i);     
            }else{
                outputMessage("End of final round");
            }
        }   //End For Loop

        outputMessage("Thanks for playing!");
        outputMessage("Out of " + numberOfRounds + " total rounds...");
        outputFinalScore();

    }   //End Main Method

    public static boolean correctAnswer(){
        int number1 = randNumByHardness(hardnessOfQuestion);        
        int number2 = randNumByHardness(hardnessOfQuestion);

        int correctAnswer = number1 + number2;

        System.out.println("What is " + number1 + " + " + number2 + "?");
        System.out.println("Please answer in integers only.");

        int studentAnswer = input.nextInt();

        if(studentAnswer == correctAnswer){
            return true;
        }else{
            return false;
        }       
    }

    public static int randNumByHardness(int hardness){
        return (int)(Math.random() * hardness);
    }

    public static void increaseHardnessByFactor(int number){
        hardnessOfQuestion *= number;
    }

    public static void decreaseHardnessByFactor(int number){
        hardnessOfQuestion /= number;
    }

    public static void increaseScoreByHardness(int hardness){
        score += hardness;
    }

    public static void outputScore(){
        System.out.println("Your current score is: " + score);
    }

    public static void outputFinalScore(){
        System.out.println("Your final score is: " + score);
        if(score==0){
            System.out.println("Were you even trying?");
        }
    }

    public static void outputHardness(){
        System.out.println("Current hardness is: " + hardnessOfQuestion);
    }

    public static void outputMessage(String message){
        System.out.println(message);
    }

    public static void outputCorrectAnswer(){
        System.out.println("The correct answer was: " + correctAnswer);
    }
}
```
## Console output
```
Round 1. Begin.
What is 3 + 8?
Please answer in integers only.
11
Answer was correct.
Your current score is: 10
End of round 1
Round 2. Begin.
What is 16 + 61?
Please answer in integers only.
77
Answer was correct.
Your current score is: 110
End of round 2
Round 3. Begin.
What is 485 + 466?
Please answer in integers only.
951
Answer was correct.
Your current score is: 1110
End of round 3
Round 4. Begin.
What is 1163 + 4805?
Please answer in integers only.
5968
Answer was correct.
Your current score is: 11110
End of final round
Thanks for playing!
Out of 4 total rounds...
Your final score is: 11110
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
First of all i want ot comment on the fact methods make our lives easier. The first addition game that i wrote was way too long because each round came with its own outline and formulas though the same things repeating over and over agian thus making it too lengthy. But using methods and for loop, it took me just a few lines and the code was done and running well. using methods makes the work easier and less time consuming because you can create the variables to use throughout your code without necessarilly reapeating them. You can also use a for loop to loop through the number of rounds defined in the beginning of the code. With for loop you don't have to repeat methods, and variables in every round.it saves time from copying and pasting all the times. 
