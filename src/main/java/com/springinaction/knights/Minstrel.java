package com.springinaction.knights;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.io.PrintStream;

/**
 * Created by iancu_000 on 04-Oct-15.
 */
@Aspect
public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    @Pointcut("execution(* *.embarkOnQuest(..))")
    public void anyQuestEmbarked(){

    }

    @Before("anyQuestEmbarked()")
    public void singBeforeQuest(){
        stream.println("Fa la la, the knight is so brave!");
    }

    @After("anyQuestEmbarked()")
    public void singAfterQuest(){
        stream.println("Tee hee hee, the brake knight did embark on a quest!");
    }
}
