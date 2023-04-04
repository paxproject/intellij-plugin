// This is a generated file. Not intended for manual editing.
package rs.pax.paxintellijplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import rs.pax.paxintellijplugin.psi.impl.*;

public interface PaxTypes {

  IElementType ANY_TAG_PAIR = new PaxElementType("ANY_TAG_PAIR");
  IElementType ANY_TEMPLATE_VALUE = new PaxElementType("ANY_TEMPLATE_VALUE");
  IElementType ATTRIBUTE_EVENT_BINDING = new PaxElementType("ATTRIBUTE_EVENT_BINDING");
  IElementType ATTRIBUTE_EVENT_ID = new PaxElementType("ATTRIBUTE_EVENT_ID");
  IElementType ATTRIBUTE_KEY_VALUE_PAIR = new PaxElementType("ATTRIBUTE_KEY_VALUE_PAIR");
  IElementType CLOSING_TAG = new PaxElementType("CLOSING_TAG");
  IElementType EVENTS_BLOCK_DECLARATION = new PaxElementType("EVENTS_BLOCK_DECLARATION");
  IElementType EVENTS_KEY = new PaxElementType("EVENTS_KEY");
  IElementType EVENTS_KEY_VALUE_PAIR = new PaxElementType("EVENTS_KEY_VALUE_PAIR");
  IElementType EVENTS_VALUE = new PaxElementType("EVENTS_VALUE");
  IElementType EXPRESSION_BODY = new PaxElementType("EXPRESSION_BODY");
  IElementType EXPRESSION_GROUPED = new PaxElementType("EXPRESSION_GROUPED");
  IElementType EXPRESSION_WRAPPED = new PaxElementType("EXPRESSION_WRAPPED");
  IElementType FUNCTION_LIST = new PaxElementType("FUNCTION_LIST");
  IElementType IDENTIFIER = new PaxElementType("IDENTIFIER");
  IElementType INNER_NODES = new PaxElementType("INNER_NODES");
  IElementType LITERAL_ENUM_ARGS_LIST = new PaxElementType("LITERAL_ENUM_ARGS_LIST");
  IElementType LITERAL_ENUM_VALUE = new PaxElementType("LITERAL_ENUM_VALUE");
  IElementType LITERAL_FUNCTION = new PaxElementType("LITERAL_FUNCTION");
  IElementType LITERAL_NUMBER = new PaxElementType("LITERAL_NUMBER");
  IElementType LITERAL_NUMBER_FLOAT = new PaxElementType("LITERAL_NUMBER_FLOAT");
  IElementType LITERAL_NUMBER_INTEGER = new PaxElementType("LITERAL_NUMBER_INTEGER");
  IElementType LITERAL_NUMBER_UNIT = new PaxElementType("LITERAL_NUMBER_UNIT");
  IElementType LITERAL_NUMBER_WITH_UNIT = new PaxElementType("LITERAL_NUMBER_WITH_UNIT");
  IElementType LITERAL_OBJECT = new PaxElementType("LITERAL_OBJECT");
  IElementType LITERAL_TUPLE = new PaxElementType("LITERAL_TUPLE");
  IElementType LITERAL_TUPLE_ACCESS = new PaxElementType("LITERAL_TUPLE_ACCESS");
  IElementType LITERAL_VALUE = new PaxElementType("LITERAL_VALUE");
  IElementType MATCHED_TAG = new PaxElementType("MATCHED_TAG");
  IElementType NODE_INNER_CONTENT = new PaxElementType("NODE_INNER_CONTENT");
  IElementType OPEN_TAG = new PaxElementType("OPEN_TAG");
  IElementType PAX_COMPONENT_DEFINITION = new PaxElementType("PAX_COMPONENT_DEFINITION");
  IElementType ROOT_TAG_PAIR = new PaxElementType("ROOT_TAG_PAIR");
  IElementType SELECTOR = new PaxElementType("SELECTOR");
  IElementType SELECTOR_BLOCK = new PaxElementType("SELECTOR_BLOCK");
  IElementType SELF_CLOSING_TAG = new PaxElementType("SELF_CLOSING_TAG");
  IElementType SETTINGS_BLOCK_DECLARATION = new PaxElementType("SETTINGS_BLOCK_DECLARATION");
  IElementType SETTINGS_KEY = new PaxElementType("SETTINGS_KEY");
  IElementType SETTINGS_KEY_VALUE_PAIR = new PaxElementType("SETTINGS_KEY_VALUE_PAIR");
  IElementType SETTINGS_VALUE = new PaxElementType("SETTINGS_VALUE");
  IElementType STATEMENT_CONTROL_FLOW = new PaxElementType("STATEMENT_CONTROL_FLOW");
  IElementType STATEMENT_FOR = new PaxElementType("STATEMENT_FOR");
  IElementType STATEMENT_FOR_PREDICATE_DECLARATION = new PaxElementType("STATEMENT_FOR_PREDICATE_DECLARATION");
  IElementType STATEMENT_FOR_SOURCE = new PaxElementType("STATEMENT_FOR_SOURCE");
  IElementType STATEMENT_IF = new PaxElementType("STATEMENT_IF");
  IElementType STATEMENT_SLOT = new PaxElementType("STATEMENT_SLOT");
  IElementType XO_FUNCTION_ARGS_LIST = new PaxElementType("XO_FUNCTION_ARGS_LIST");
  IElementType XO_FUNCTION_CALL = new PaxElementType("XO_FUNCTION_CALL");
  IElementType XO_INFIX = new PaxElementType("XO_INFIX");
  IElementType XO_LITERAL = new PaxElementType("XO_LITERAL");
  IElementType XO_OBJECT = new PaxElementType("XO_OBJECT");
  IElementType XO_OBJECT_SETTINGS_KEY_VALUE_PAIR = new PaxElementType("XO_OBJECT_SETTINGS_KEY_VALUE_PAIR");
  IElementType XO_PREFIX = new PaxElementType("XO_PREFIX");
  IElementType XO_PRIMARY = new PaxElementType("XO_PRIMARY");
  IElementType XO_RANGE = new PaxElementType("XO_RANGE");
  IElementType XO_SYMBOL = new PaxElementType("XO_SYMBOL");
  IElementType XO_TUPLE = new PaxElementType("XO_TUPLE");

  IElementType ANY = new PaxTokenType("any");
  IElementType ASCIIDIGIT = new PaxTokenType("asciidigit");
  IElementType AT = new PaxTokenType("@");
  IElementType COLON = new PaxTokenType(":");
  IElementType COMMA = new PaxTokenType(",");
  IElementType COMMENT = new PaxTokenType("comment");
  IElementType DOT = new PaxTokenType(".");
  IElementType EQ = new PaxTokenType("=");
  IElementType EVENTS = new PaxTokenType("@events");
  IElementType FOR_KEYWORD = new PaxTokenType("for");
  IElementType HASH = new PaxTokenType("#");
  IElementType IF_KEYWORD = new PaxTokenType("if");
  IElementType IN_KEYWORD = new PaxTokenType("in");
  IElementType LCURLY = new PaxTokenType("{");
  IElementType LOWERIDENTIFIER = new PaxTokenType("loweridentifier");
  IElementType LPAREN = new PaxTokenType("(");
  IElementType LSQUARE = new PaxTokenType("[");
  IElementType PASCALIDENTIFIER = new PaxTokenType("pascalidentifier");
  IElementType RCURLY = new PaxTokenType("}");
  IElementType RPAREN = new PaxTokenType(")");
  IElementType RSQUARE = new PaxTokenType("]");
  IElementType SETTINGS = new PaxTokenType("@settings");
  IElementType SLOT_KEYWORD = new PaxTokenType("slot");
  IElementType STRING = new PaxTokenType("string");
  IElementType STRINGLIT = new PaxTokenType("stringlit");
  IElementType SUBCLASS = new PaxTokenType("::");
  IElementType XO_ADD = new PaxTokenType("+");
  IElementType XO_BOOL_AND = new PaxTokenType("&&");
  IElementType XO_BOOL_NOT = new PaxTokenType("!");
  IElementType XO_BOOL_OR = new PaxTokenType("||");
  IElementType XO_DIV = new PaxTokenType("/");
  IElementType XO_DOLLAR = new PaxTokenType("$");
  IElementType XO_EXP = new PaxTokenType("^");
  IElementType XO_MOD = new PaxTokenType("%%");
  IElementType XO_MUL = new PaxTokenType("*");
  IElementType XO_NEG = new PaxTokenType("-");
  IElementType XO_PERCENT = new PaxTokenType("%");
  IElementType XO_RANGE_EXCLUSIVE = new PaxTokenType("..");
  IElementType XO_RANGE_INCLUSIVE = new PaxTokenType("...");
  IElementType XO_REL_EQ = new PaxTokenType("==");
  IElementType XO_REL_GT = new PaxTokenType(">");
  IElementType XO_REL_GTE = new PaxTokenType(">=");
  IElementType XO_REL_LT = new PaxTokenType("<");
  IElementType XO_REL_LTE = new PaxTokenType("<=");
  IElementType XO_REL_NEQ = new PaxTokenType("!=");
  IElementType XO_TERN_ELSE = new PaxTokenType("xo_tern_else");
  IElementType XO_TERN_THEN = new PaxTokenType("?");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ANY_TAG_PAIR) {
        return new PaxAnyTagPairImpl(node);
      }
      else if (type == ANY_TEMPLATE_VALUE) {
        return new PaxAnyTemplateValueImpl(node);
      }
      else if (type == ATTRIBUTE_EVENT_BINDING) {
        return new PaxAttributeEventBindingImpl(node);
      }
      else if (type == ATTRIBUTE_EVENT_ID) {
        return new PaxAttributeEventIdImpl(node);
      }
      else if (type == ATTRIBUTE_KEY_VALUE_PAIR) {
        return new PaxAttributeKeyValuePairImpl(node);
      }
      else if (type == CLOSING_TAG) {
        return new PaxClosingTagImpl(node);
      }
      else if (type == EVENTS_BLOCK_DECLARATION) {
        return new PaxEventsBlockDeclarationImpl(node);
      }
      else if (type == EVENTS_KEY) {
        return new PaxEventsKeyImpl(node);
      }
      else if (type == EVENTS_KEY_VALUE_PAIR) {
        return new PaxEventsKeyValuePairImpl(node);
      }
      else if (type == EVENTS_VALUE) {
        return new PaxEventsValueImpl(node);
      }
      else if (type == EXPRESSION_BODY) {
        return new PaxExpressionBodyImpl(node);
      }
      else if (type == EXPRESSION_GROUPED) {
        return new PaxExpressionGroupedImpl(node);
      }
      else if (type == EXPRESSION_WRAPPED) {
        return new PaxExpressionWrappedImpl(node);
      }
      else if (type == FUNCTION_LIST) {
        return new PaxFunctionListImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new PaxIdentifierImpl(node);
      }
      else if (type == INNER_NODES) {
        return new PaxInnerNodesImpl(node);
      }
      else if (type == LITERAL_ENUM_ARGS_LIST) {
        return new PaxLiteralEnumArgsListImpl(node);
      }
      else if (type == LITERAL_ENUM_VALUE) {
        return new PaxLiteralEnumValueImpl(node);
      }
      else if (type == LITERAL_FUNCTION) {
        return new PaxLiteralFunctionImpl(node);
      }
      else if (type == LITERAL_NUMBER) {
        return new PaxLiteralNumberImpl(node);
      }
      else if (type == LITERAL_NUMBER_FLOAT) {
        return new PaxLiteralNumberFloatImpl(node);
      }
      else if (type == LITERAL_NUMBER_INTEGER) {
        return new PaxLiteralNumberIntegerImpl(node);
      }
      else if (type == LITERAL_NUMBER_UNIT) {
        return new PaxLiteralNumberUnitImpl(node);
      }
      else if (type == LITERAL_NUMBER_WITH_UNIT) {
        return new PaxLiteralNumberWithUnitImpl(node);
      }
      else if (type == LITERAL_OBJECT) {
        return new PaxLiteralObjectImpl(node);
      }
      else if (type == LITERAL_TUPLE) {
        return new PaxLiteralTupleImpl(node);
      }
      else if (type == LITERAL_TUPLE_ACCESS) {
        return new PaxLiteralTupleAccessImpl(node);
      }
      else if (type == LITERAL_VALUE) {
        return new PaxLiteralValueImpl(node);
      }
      else if (type == MATCHED_TAG) {
        return new PaxMatchedTagImpl(node);
      }
      else if (type == NODE_INNER_CONTENT) {
        return new PaxNodeInnerContentImpl(node);
      }
      else if (type == OPEN_TAG) {
        return new PaxOpenTagImpl(node);
      }
      else if (type == PAX_COMPONENT_DEFINITION) {
        return new PaxPaxComponentDefinitionImpl(node);
      }
      else if (type == ROOT_TAG_PAIR) {
        return new PaxRootTagPairImpl(node);
      }
      else if (type == SELECTOR) {
        return new PaxSelectorImpl(node);
      }
      else if (type == SELECTOR_BLOCK) {
        return new PaxSelectorBlockImpl(node);
      }
      else if (type == SELF_CLOSING_TAG) {
        return new PaxSelfClosingTagImpl(node);
      }
      else if (type == SETTINGS_BLOCK_DECLARATION) {
        return new PaxSettingsBlockDeclarationImpl(node);
      }
      else if (type == SETTINGS_KEY) {
        return new PaxSettingsKeyImpl(node);
      }
      else if (type == SETTINGS_KEY_VALUE_PAIR) {
        return new PaxSettingsKeyValuePairImpl(node);
      }
      else if (type == SETTINGS_VALUE) {
        return new PaxSettingsValueImpl(node);
      }
      else if (type == STATEMENT_CONTROL_FLOW) {
        return new PaxStatementControlFlowImpl(node);
      }
      else if (type == STATEMENT_FOR) {
        return new PaxStatementForImpl(node);
      }
      else if (type == STATEMENT_FOR_PREDICATE_DECLARATION) {
        return new PaxStatementForPredicateDeclarationImpl(node);
      }
      else if (type == STATEMENT_FOR_SOURCE) {
        return new PaxStatementForSourceImpl(node);
      }
      else if (type == STATEMENT_IF) {
        return new PaxStatementIfImpl(node);
      }
      else if (type == STATEMENT_SLOT) {
        return new PaxStatementSlotImpl(node);
      }
      else if (type == XO_FUNCTION_ARGS_LIST) {
        return new PaxXoFunctionArgsListImpl(node);
      }
      else if (type == XO_FUNCTION_CALL) {
        return new PaxXoFunctionCallImpl(node);
      }
      else if (type == XO_INFIX) {
        return new PaxXoInfixImpl(node);
      }
      else if (type == XO_LITERAL) {
        return new PaxXoLiteralImpl(node);
      }
      else if (type == XO_OBJECT) {
        return new PaxXoObjectImpl(node);
      }
      else if (type == XO_OBJECT_SETTINGS_KEY_VALUE_PAIR) {
        return new PaxXoObjectSettingsKeyValuePairImpl(node);
      }
      else if (type == XO_PREFIX) {
        return new PaxXoPrefixImpl(node);
      }
      else if (type == XO_PRIMARY) {
        return new PaxXoPrimaryImpl(node);
      }
      else if (type == XO_RANGE) {
        return new PaxXoRangeImpl(node);
      }
      else if (type == XO_SYMBOL) {
        return new PaxXoSymbolImpl(node);
      }
      else if (type == XO_TUPLE) {
        return new PaxXoTupleImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
