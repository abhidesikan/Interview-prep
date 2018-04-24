package com.abhidesikan.interviewprep.rubica;

/*
Utilizing a language of your choice, in a style of your choice, please implement the rules of bowling such that
if provided a list of rolls and pins knocked down each roll, the program provides the final score,
the running score for each frame, and a record of whether the bowler had a strike, spare, or open frame for each frame.
For bonus points, allow for the addition of custom rules and provide an example such a custom rule.
The following link provides information on the game of bowling relevant to this problem.
*/

import java.util.ArrayList;
import java.util.List;

/**
 * A class which has methods to get the final score and running score of a bowling game based on input pins.
 *
 * Assumptions - Number of pins felled is a number between [0-10]. A gutter or a foul are both counted as 0.
 */
public class BowlingGame {

	//Class variables to store the score of the game at each frame,
	// and it's corresponding record (Strike, Spare, Open)
	static int[] score = new int[11];
	static String[] record = new String[11];

	/**
	 * Method which calculates the cumulative score based on input pins knocked per frame and prints the final score
	 * for the given inputs.
	 * @param pinsKnockedDown List of integers containing sequence of pins knocked down.
	 */
	public static void getFinalScore(List<Integer> pinsKnockedDown) {
		int frame = 1;
		for (int i = 0; i < pinsKnockedDown.size(); i++) {

			//Special condition to account for the last frame, where we might have three rolls of the pin
			// if the first was a strike.
			if (frame == 10) {
				if (pinsKnockedDown.get(i) == 10) {
					score[frame] = score[frame - 1] + 10 + pinsKnockedDown.get(i + 1) + pinsKnockedDown.get(i + 2);
					record[frame] = "Strike";
				} else {
					score[frame] = score[frame - 1] + pinsKnockedDown.get(i) + pinsKnockedDown.get(i + 1);
					record[frame] = "Open";
				}
				break;
			} else {
				// If we hit a strike, we need to add the sum of the next two rolls to the current frame.
				if (pinsKnockedDown.get(i) == 10) {
					score[frame] = score[frame - 1] + 10 + pinsKnockedDown.get(i + 1) + pinsKnockedDown.get(i + 2);
					record[frame] = "Strike";
					frame++;
				}
				// If we make a spare, we need to add the sum of the next roll to the current frame.
				else if (pinsKnockedDown.get(i) + pinsKnockedDown.get(i + 1) == 10) {
					score[frame] = score[frame - 1] + 10 + pinsKnockedDown.get(i + 2);
					record[frame] = "Spare";
					frame++;
					i++;  // we need to move an index more if we make use of two pins for one frame.
				} else {
					score[frame] = score[frame - 1] + pinsKnockedDown.get(i) + pinsKnockedDown.get(i + 1);
					record[frame] = "Open";
					frame++;
					i++; // same reason as above
				}
			}
		}
		System.out.println("The final score after this game is " + score[score.length - 1]);
	}

	/**
	 * Method to print out the running score for the given input frame and it's corresponding record.
	 * @param frame The input frame number. (1-10)
	 */
	public static void printScoreAndRecordOfFrame(int frame) {
		System.out.println("The running score at frame " + frame + " is " + score[frame]);
		System.out.println("The record at this frame is " + record[frame]);
		System.out.println("----------------------------------------");
	}


	public static void main(String[] args) {
		List<Integer> pinsList = new ArrayList<>();

		//All strikes as input
		for (int i = 0; i < 13; i++) {
			pinsList.add(10);
		}
		getFinalScore(pinsList);
		printScoreAndRecordOfFrame(5);

		pinsList = new ArrayList<>();

		//Random input
		int arr[] = new int[] {10, 7, 3, 9, 0, 10, 0, 8, 8, 2, 0, 6, 10, 10, 10, 8, 1};

		for(int i=0; i<arr.length; i++) {
			pinsList.add(arr[i]);
		}
		getFinalScore(pinsList);
		printScoreAndRecordOfFrame(2);

		pinsList = new ArrayList<>();

		//All 0's as input
		for (int i = 0; i < 21; i++) {
			pinsList.add(0);
		}
		getFinalScore(pinsList);
		printScoreAndRecordOfFrame(3);
	}
}
