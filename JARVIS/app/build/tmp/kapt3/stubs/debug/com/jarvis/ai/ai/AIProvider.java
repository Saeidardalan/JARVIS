package com.jarvis.ai.ai;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\tR\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\n"}, d2 = {"Lcom/jarvis/ai/ai/AIProvider;", "", "name", "", "getName", "()Ljava/lang/String;", "generateResponse", "systemPrompt", "userPrompt", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface AIProvider {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object generateResponse(@org.jetbrains.annotations.Nullable()
    java.lang.String systemPrompt, @org.jetbrains.annotations.NotNull()
    java.lang.String userPrompt, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getName();
}