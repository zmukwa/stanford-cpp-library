package stanford.spl;

import acm.util.TokenScanner;

class AutograderInput_addCategory extends JBECommand {
	public void execute(TokenScanner paramTokenScanner, JavaBackEnd paramJavaBackEnd) {
		paramTokenScanner.verifyToken("(");
		String name = SplPipeDecoder.readAndDecode(paramTokenScanner);
		paramTokenScanner.verifyToken(")");
		AutograderInput autograderInput = AutograderInput.getInstance(paramJavaBackEnd);
		autograderInput.addCategory(name);
	}
}
