package com.example.quizapp.utils

import com.example.quizapp.model.Question

object Constants {

    const val USER_NAME = "user_name"
    const val TOTAL_QUESTIONS = "total_questions"
    const val SCORE = "correct_answers"

    fun getQuestions(): MutableList<Question> {
        val questions = mutableListOf<Question>()

        val quest1  = Question(
            1, "What is the maximum addressable memory in the 8086 microprocessor?",
            "64 KB",
            "1 MB",
            "16 MB",
            "4 GB",
            3
        )
        questions.add(quest1)

        val quest2  = Question(
            2, "Which addressing mode is not supported by the 8086 microprocessor?",
            "Register addressing mode",
            "Immediate addressing mode",
            "Base register addressing mode",
            "Indirect addressing mode",
            1
        )
        questions.add(quest2)

        val quest3  = Question(
            3, "What is the data bus size of the 8086 microprocessor?",
            "8 bits",
            "16 bits",
            "32 bits",
            "64 bits",
            2
        )
        questions.add(quest3)

        val quest4  = Question(
            4, "How many general-purpose I/O ports does the 8051 microcontroller have?",
            "1",
            "2",
            "3",
            "4",
            4
        )
        questions.add(quest4)

        val quest5  = Question(
            5, "Which register is used as a program counter in the 8051 microcontroller?",
            "R0",
            "R1",
            "DPTR",
            "PC",
            4
        )
        questions.add(quest5)

        val quest6  = Question(
            6, "What is the clock frequency range of the 8051 microcontroller?",
            "1 MHz - 10 MHz",
            "4 MHz - 16 MHz",
            "8 MHz - 24 MHz",
            "12 MHz - 30 MHz",
            3
        )
        questions.add(quest6)

        val quest7  = Question(
            7, "Which ARM processor architecture is most commonly used in mobile devices?",
            "ARMv5",
            "ARMv7",
            "ARMv8",
            "ARMv9",
            2
        )
        questions.add(quest7)

        val quest8  = Question(
            8, "What is the primary advantage of the ARM architecture over traditional CISC architectures?",
            "Lower power consumption",
            "Higher clock speeds",
            "Larger instruction set",
            "More complex instructions",
            1
        )
        questions.add(quest8)

        val quest9  = Question(
            9, "Which company is responsible for the development of the ARM architecture?",
            "Intel",
            "AMD",
            "ARM Holdings",
            "Qualcomm",
            3
        )
        questions.add(quest9)

        val quest10  = Question(
            10, "What does the term \"RISC\" stand for in the context of ARM processors?",
            "Random Instruction Set Computing",
            "Reduced Instruction Set Computing",
            "Rapid Instruction Set Computing",
            "Real Instruction Set Computing",
            2
        )
        questions.add(quest10)

        return questions
    }
}