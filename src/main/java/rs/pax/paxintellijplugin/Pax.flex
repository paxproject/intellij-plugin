package rs.pax.paxintellijplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static rs.pax.paxintellijplugin.psi.PaxTypes.*;

%%

%{
  public PaxLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class PaxLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

PASCALIDENTIFIER=[A-Z][a-zA-Z_0-9]*
IDENTIFIER=[:letter:][a-zA-Z_0-9]*
ASCIIDIGIT=[0-9]
STRINGLIT=\"([^\"\\]|\\.)*\"
SPACE=[ \t\n\x0B\f\r]+
COMMENT=(("/"[*])([\s\S]+)([*]"/"))|([/]{2}[^\n]+)
ANY=.

%%
<YYINITIAL> {
  {WHITE_SPACE}           { return WHITE_SPACE; }

  "="                     { return EQ; }
  "::"                    { return SUBCLASS; }
  "("                     { return LPAREN; }
  ")"                     { return RPAREN; }
  "}"                     { return RCURLY; }
  "{"                     { return LCURLY; }
  ","                     { return COMMA; }
  "@"                     { return AT; }
  "+"                     { return XOADD; }
  "&&"                    { return XOBOOL_AND; }
  "||"                    { return XOBOOL_OR; }
  "/"                     { return XO_DIV; }
  "^"                     { return XO_EXP; }
  "%%"                    { return XO_MOD; }
  "*"                     { return XO_MUL; }
  "=="                    { return XO_REL_EQ; }
  ">"                     { return XO_REL_GT; }
  ">="                    { return XO_REL_GTE; }
  "<"                     { return XO_REL_LT; }
  "<="                    { return XO_REL_LTE; }
  "!="                    { return XO_REL_NEQ; }
  "?"                     { return XO_TERN_THEN; }
  "-"                     { return XO_NEG; }
  "!"                     { return XO_BOOL_NOT; }
  "%"                     { return XO_PERCENT; }
  ".."                    { return XO_RANGE_EXCLUSIVE; }
  "..."                   { return XO_RANGE_INCLUSIVE; }
  "$"                     { return XO_DOLLAR; }
  "."                     { return DOT; }
  "#"                     { return HASH; }
  ":"                     { return COLON; }
  "["                     { return LSQUARE; }
  "]"                     { return RSQUARE; }
  "if"                    { return IF_KEYWORD; }
  "for"                   { return FOR_KEYWORD; }
  "in"                    { return IN_KEYWORD; }
  "slot"                  { return SLOT_KEYWORD; }
  "xo_add"                { return XO_ADD; }
  "xo_bool_and"           { return XO_BOOL_AND; }
  "xo_bool_or"            { return XO_BOOL_OR; }
  "xo_sub"                { return XO_SUB; }
  "xo_tern_else"          { return XO_TERN_ELSE; }
  "string"                { return STRING; }

  {PASCALIDENTIFIER}      { return PASCALIDENTIFIER; }
  {IDENTIFIER}            { return IDENTIFIER; }
  {ASCIIDIGIT}            { return ASCIIDIGIT; }
  {STRINGLIT}             { return STRINGLIT; }
  {SPACE}                 { return SPACE; }
  {COMMENT}               { return COMMENT; }
  {ANY}                   { return ANY; }

}

[^] { return BAD_CHARACTER; }
