package net.worldseed.multipart.animations;

import java.util.function.Consumer;

public sealed interface AnimationHandler permits AnimationHandlerImpl {
    void playRepeat(String animation);
    void stopRepeat(String animation);
    void playOnce(String animation, Consumer<Void> cb);
    void destroy();
    String getPlaying();
    void setUpdates(boolean updates);
}