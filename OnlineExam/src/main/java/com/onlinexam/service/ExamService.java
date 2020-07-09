package com.onlinexam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinexam.Entity.AttemptQue;
import com.onlinexam.Entity.Exam;
import com.onlinexam.Entity.ExamQuestions;
import com.onlinexam.Entity.Options;
import com.onlinexam.Entity.Result;
import com.onlinexam.Entity.User;
import com.onlinexam.repo.AttemptRepo;
import com.onlinexam.repo.ExamRepo;
import com.onlinexam.repo.ResultRepo;
import com.onlinexam.repo.UserRepo;

@Service
public class ExamService {
	@Autowired
	private ExamRepo examRepo;
	@Autowired
	private AttemptRepo attemptRepo;
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private ResultRepo resultRepo;

	public Result save(Long examId) {

		Exam exam = examRepo.findById(examId).orElseThrow(() -> new RuntimeException("Exam not exist"));

		List<AttemptQue> attempts = exam.getAttempts();
		Integer marks = 0;
		Integer correctAnswer = 0;
	Float negativemarks =Float .valueOf(exam.getNegativeMarks());
		Integer toatalQuestion = 0;

		for (AttemptQue att : attempts) 
		{
			List<Options> options = att.getQuestion().getOptions();

			for (Options opt : options) 
			{
				if (opt.getOptionName().equals(att.getSelectedOption())) 
				{

					if (opt.isIscorrect() == true)
					{
						marks++;
						correctAnswer++;

					}

				}
			}

		}

		User user = exam.getUser();
		Result result = new Result();

		int totalQuestion = attempts.size();
		int wrongAnswer = totalQuestion - correctAnswer;
float negativecount = marks-(wrongAnswer*negativemarks);
//result.setNegativemarks(String.valueOf(negativecount));
exam.setNegativeMarks(String.valueOf(negativecount));
		result.setUser(user);
		result.setTotalmarks(String.valueOf(negativecount));
		result.setCorrectAnswer(correctAnswer.toString());
		result.setWrongAnswer(String.valueOf(wrongAnswer));
		Result save = resultRepo.save(result);
		return save;
	}

}
