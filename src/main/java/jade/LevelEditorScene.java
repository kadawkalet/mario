package jade;

import java.awt.event.KeyEvent;

public class LevelEditorScene extends Scene {

    private String vertexShaderSrc = "#type vertex\n" +
            "#version 330 core\n" +
            "\n" +
            "layout (location=0) in vec3 aPos;\n" +
            "layout (location=1) in vec4 aColor;\n" +
            "\n" +
            "out vec4 fColor;\n" +
            "\n" +
            "void main() {\n" +
            "    fColor = aColor;\n" +
            "    gl_Position = vec4(aPos, 1.0);\n" +
            "}";
    
    public LevelEditorScene() {

    }

    @Override
    public void update(float dt) {

    }
}
