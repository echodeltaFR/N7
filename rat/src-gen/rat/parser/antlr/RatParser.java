/*
 * generated by Xtext 2.12.0
 */
package rat.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import rat.parser.antlr.internal.InternalRatParser;
import rat.services.RatGrammarAccess;

public class RatParser extends AbstractAntlrParser {

	@Inject
	private RatGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalRatParser createParser(XtextTokenStream stream) {
		return new InternalRatParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Prog";
	}

	public RatGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RatGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
