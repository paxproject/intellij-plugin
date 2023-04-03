// This is a generated file. Not intended for manual editing.
package rs.pax.paxintellijplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static rs.pax.paxintellijplugin.psi.PaxTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class PaxParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return paxFile(b, l + 1);
  }

  /* ********************************************************** */
  // statement_control_flow | matched_tag | self_closing_tag
  public static boolean any_tag_pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any_tag_pair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANY_TAG_PAIR, "<any tag pair>");
    r = statement_control_flow(b, l + 1);
    if (!r) r = matched_tag(b, l + 1);
    if (!r) r = self_closing_tag(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // literal_value | expression_wrapped | identifier
  public static boolean any_template_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any_template_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANY_TEMPLATE_VALUE, "<any template value>");
    r = literal_value(b, l + 1);
    if (!r) r = expression_wrapped(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // attribute_event_id  '=' literal_function
  public static boolean attribute_event_binding(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_event_binding")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attribute_event_id(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && literal_function(b, l + 1);
    exit_section_(b, m, ATTRIBUTE_EVENT_BINDING, r);
    return r;
  }

  /* ********************************************************** */
  // '@'  identifier
  public static boolean attribute_event_id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_event_id")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AT, IDENTIFIER);
    exit_section_(b, m, ATTRIBUTE_EVENT_ID, r);
    return r;
  }

  /* ********************************************************** */
  // attribute_event_binding | (identifier '=' any_template_value)
  public static boolean attribute_key_value_pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_key_value_pair")) return false;
    if (!nextTokenIs(b, "<attribute key value pair>", AT, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_KEY_VALUE_PAIR, "<attribute key value pair>");
    r = attribute_event_binding(b, l + 1);
    if (!r) r = attribute_key_value_pair_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identifier '=' any_template_value
  private static boolean attribute_key_value_pair_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_key_value_pair_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, EQ);
    r = r && any_template_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '<'  '/'  '>'
  public static boolean closing_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "closing_tag")) return false;
    if (!nextTokenIs(b, XO_REL_LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, XO_REL_LT, XO_DIV, XO_REL_GT);
    exit_section_(b, m, CLOSING_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // '@'  "events"  '{'  events_key_value_pair*  '}'
  public static boolean events_block_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "events_block_declaration")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT);
    r = r && consumeToken(b, "events");
    r = r && consumeToken(b, LCURLY);
    r = r && events_block_declaration_3(b, l + 1);
    r = r && consumeToken(b, RCURLY);
    exit_section_(b, m, EVENTS_BLOCK_DECLARATION, r);
    return r;
  }

  // events_key_value_pair*
  private static boolean events_block_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "events_block_declaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!events_key_value_pair(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "events_block_declaration_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // identifier  ':'
  public static boolean events_key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "events_key")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    exit_section_(b, m, EVENTS_KEY, r);
    return r;
  }

  /* ********************************************************** */
  // events_key  events_value  ','?
  public static boolean events_key_value_pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "events_key_value_pair")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = events_key(b, l + 1);
    r = r && events_value(b, l + 1);
    r = r && events_key_value_pair_2(b, l + 1);
    exit_section_(b, m, EVENTS_KEY_VALUE_PAIR, r);
    return r;
  }

  // ','?
  private static boolean events_key_value_pair_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "events_key_value_pair_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // literal_function | function_list
  public static boolean events_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "events_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EVENTS_VALUE, "<events value>");
    r = literal_function(b, l + 1);
    if (!r) r = function_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // xo_prefix*  xo_primary  (xo_infix  xo_prefix*  xo_primary )*
  public static boolean expression_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_BODY, "<expression body>");
    r = expression_body_0(b, l + 1);
    r = r && xo_primary(b, l + 1);
    r = r && expression_body_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // xo_prefix*
  private static boolean expression_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_body_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!xo_prefix(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_body_0", c)) break;
    }
    return true;
  }

  // (xo_infix  xo_prefix*  xo_primary )*
  private static boolean expression_body_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_body_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression_body_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_body_2", c)) break;
    }
    return true;
  }

  // xo_infix  xo_prefix*  xo_primary
  private static boolean expression_body_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_body_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xo_infix(b, l + 1);
    r = r && expression_body_2_0_1(b, l + 1);
    r = r && xo_primary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // xo_prefix*
  private static boolean expression_body_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_body_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!xo_prefix(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_body_2_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '('  expression_body  ')'  literal_number_unit?
  public static boolean expression_grouped(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_grouped")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && expression_body(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && expression_grouped_3(b, l + 1);
    exit_section_(b, m, EXPRESSION_GROUPED, r);
    return r;
  }

  // literal_number_unit?
  private static boolean expression_grouped_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_grouped_3")) return false;
    literal_number_unit(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '{'  expression_body  '}'
  public static boolean expression_wrapped(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_wrapped")) return false;
    if (!nextTokenIs(b, LCURLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LCURLY);
    r = r && expression_body(b, l + 1);
    r = r && consumeToken(b, RCURLY);
    exit_section_(b, m, EXPRESSION_WRAPPED, r);
    return r;
  }

  /* ********************************************************** */
  // '['  literal_function*  ']'
  public static boolean function_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_list")) return false;
    if (!nextTokenIs(b, LSQUARE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LSQUARE);
    r = r && function_list_1(b, l + 1);
    r = r && consumeToken(b, RSQUARE);
    exit_section_(b, m, FUNCTION_LIST, r);
    return r;
  }

  // literal_function*
  private static boolean function_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!literal_function(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_list_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // node_inner_content | (any_tag_pair)*
  public static boolean inner_nodes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inner_nodes")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INNER_NODES, "<inner nodes>");
    r = node_inner_content(b, l + 1);
    if (!r) r = inner_nodes_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (any_tag_pair)*
  private static boolean inner_nodes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inner_nodes_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!inner_nodes_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "inner_nodes_1", c)) break;
    }
    return true;
  }

  // (any_tag_pair)
  private static boolean inner_nodes_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inner_nodes_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = any_tag_pair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // literal_value  (','  literal_value)*
  public static boolean literal_enum_args_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_enum_args_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_ENUM_ARGS_LIST, "<literal enum args list>");
    r = literal_value(b, l + 1);
    r = r && literal_enum_args_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (','  literal_value)*
  private static boolean literal_enum_args_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_enum_args_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!literal_enum_args_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "literal_enum_args_list_1", c)) break;
    }
    return true;
  }

  // ','  literal_value
  private static boolean literal_enum_args_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_enum_args_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && literal_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // pascalidentifier  ('::'  identifier)*  ('(' literal_enum_args_list ')')?
  public static boolean literal_enum_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_enum_value")) return false;
    if (!nextTokenIs(b, PASCALIDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PASCALIDENTIFIER);
    r = r && literal_enum_value_1(b, l + 1);
    r = r && literal_enum_value_2(b, l + 1);
    exit_section_(b, m, LITERAL_ENUM_VALUE, r);
    return r;
  }

  // ('::'  identifier)*
  private static boolean literal_enum_value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_enum_value_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!literal_enum_value_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "literal_enum_value_1", c)) break;
    }
    return true;
  }

  // '::'  identifier
  private static boolean literal_enum_value_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_enum_value_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SUBCLASS, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('(' literal_enum_args_list ')')?
  private static boolean literal_enum_value_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_enum_value_2")) return false;
    literal_enum_value_2_0(b, l + 1);
    return true;
  }

  // '(' literal_enum_args_list ')'
  private static boolean literal_enum_value_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_enum_value_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && literal_enum_args_list(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "self." ?  identifier  ','?
  public static boolean literal_function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_function")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_FUNCTION, "<literal function>");
    r = literal_function_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && literal_function_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "self." ?
  private static boolean literal_function_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_function_0")) return false;
    consumeToken(b, "self.");
    return true;
  }

  // ','?
  private static boolean literal_function_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_function_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // literal_number_float | literal_number_integer
  public static boolean literal_number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_number")) return false;
    if (!nextTokenIs(b, "<literal number>", ASCIIDIGIT, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_NUMBER, "<literal number>");
    r = literal_number_float(b, l + 1);
    if (!r) r = literal_number_integer(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // asciidigit *  '.'  asciidigit+
  public static boolean literal_number_float(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_number_float")) return false;
    if (!nextTokenIs(b, "<literal number float>", ASCIIDIGIT, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_NUMBER_FLOAT, "<literal number float>");
    r = literal_number_float_0(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && literal_number_float_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // asciidigit *
  private static boolean literal_number_float_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_number_float_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, ASCIIDIGIT)) break;
      if (!empty_element_parsed_guard_(b, "literal_number_float_0", c)) break;
    }
    return true;
  }

  // asciidigit+
  private static boolean literal_number_float_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_number_float_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASCIIDIGIT);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, ASCIIDIGIT)) break;
      if (!empty_element_parsed_guard_(b, "literal_number_float_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (!('.')  asciidigit)+
  public static boolean literal_number_integer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_number_integer")) return false;
    if (!nextTokenIs(b, ASCIIDIGIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = literal_number_integer_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!literal_number_integer_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "literal_number_integer", c)) break;
    }
    exit_section_(b, m, LITERAL_NUMBER_INTEGER, r);
    return r;
  }

  // !('.')  asciidigit
  private static boolean literal_number_integer_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_number_integer_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = literal_number_integer_0_0(b, l + 1);
    r = r && consumeToken(b, ASCIIDIGIT);
    exit_section_(b, m, null, r);
    return r;
  }

  // !('.')
  private static boolean literal_number_integer_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_number_integer_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, DOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '%' | "px"
  public static boolean literal_number_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_number_unit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_NUMBER_UNIT, "<literal number unit>");
    r = consumeToken(b, XO_PERCENT);
    if (!r) r = consumeToken(b, "px");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // literal_number  literal_number_unit
  public static boolean literal_number_with_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_number_with_unit")) return false;
    if (!nextTokenIs(b, "<literal number with unit>", ASCIIDIGIT, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_NUMBER_WITH_UNIT, "<literal number with unit>");
    r = literal_number(b, l + 1);
    r = r && literal_number_unit(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // pascalidentifier?  '{'  settings_key_value_pair*  '}'
  public static boolean literal_object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_object")) return false;
    if (!nextTokenIs(b, "<literal object>", LCURLY, PASCALIDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_OBJECT, "<literal object>");
    r = literal_object_0(b, l + 1);
    r = r && consumeToken(b, LCURLY);
    r = r && literal_object_2(b, l + 1);
    r = r && consumeToken(b, RCURLY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pascalidentifier?
  private static boolean literal_object_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_object_0")) return false;
    consumeToken(b, PASCALIDENTIFIER);
    return true;
  }

  // settings_key_value_pair*
  private static boolean literal_object_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_object_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!settings_key_value_pair(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "literal_object_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ('(')  literal_value  (','  literal_value)*  (')')
  public static boolean literal_tuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_tuple")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && literal_value(b, l + 1);
    r = r && literal_tuple_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, LITERAL_TUPLE, r);
    return r;
  }

  // (','  literal_value)*
  private static boolean literal_tuple_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_tuple_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!literal_tuple_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "literal_tuple_2", c)) break;
    }
    return true;
  }

  // ','  literal_value
  private static boolean literal_tuple_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_tuple_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && literal_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier  '.'  literal_number_integer
  public static boolean literal_tuple_access(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_tuple_access")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, DOT);
    r = r && literal_number_integer(b, l + 1);
    exit_section_(b, m, LITERAL_TUPLE_ACCESS, r);
    return r;
  }

  /* ********************************************************** */
  // literal_number_with_unit | literal_number | literal_tuple | literal_enum_value | stringlit
  public static boolean literal_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_VALUE, "<literal value>");
    r = literal_number_with_unit(b, l + 1);
    if (!r) r = literal_number(b, l + 1);
    if (!r) r = literal_tuple(b, l + 1);
    if (!r) r = literal_enum_value(b, l + 1);
    if (!r) r = consumeToken(b, STRINGLIT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // open_tag  inner_nodes  closing_tag
  public static boolean matched_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matched_tag")) return false;
    if (!nextTokenIs(b, XO_REL_LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = open_tag(b, l + 1);
    r = r && inner_nodes(b, l + 1);
    r = r && closing_tag(b, l + 1);
    exit_section_(b, m, MATCHED_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // literal_value | expression_wrapped
  public static boolean node_inner_content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "node_inner_content")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NODE_INNER_CONTENT, "<node inner content>");
    r = literal_value(b, l + 1);
    if (!r) r = expression_wrapped(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<' pascalidentifier  attribute_key_value_pair*  '>'
  public static boolean open_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "open_tag")) return false;
    if (!nextTokenIs(b, XO_REL_LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, XO_REL_LT, PASCALIDENTIFIER);
    r = r && open_tag_2(b, l + 1);
    r = r && consumeToken(b, XO_REL_GT);
    exit_section_(b, m, OPEN_TAG, r);
    return r;
  }

  // attribute_key_value_pair*
  private static boolean open_tag_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "open_tag_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!attribute_key_value_pair(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "open_tag_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // pax_component_definition*
  static boolean paxFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paxFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!pax_component_definition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "paxFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (root_tag_pair | settings_block_declaration | events_block_declaration)+
  public static boolean pax_component_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pax_component_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAX_COMPONENT_DEFINITION, "<pax component definition>");
    r = pax_component_definition_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!pax_component_definition_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pax_component_definition", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // root_tag_pair | settings_block_declaration | events_block_declaration
  private static boolean pax_component_definition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pax_component_definition_0")) return false;
    boolean r;
    r = root_tag_pair(b, l + 1);
    if (!r) r = settings_block_declaration(b, l + 1);
    if (!r) r = events_block_declaration(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // any_tag_pair
  public static boolean root_tag_pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_tag_pair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ROOT_TAG_PAIR, "<root tag pair>");
    r = any_tag_pair(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('.' | '#')  identifier
  public static boolean selector(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector")) return false;
    if (!nextTokenIs(b, "<selector>", DOT, HASH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECTOR, "<selector>");
    r = selector_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '.' | '#'
  private static boolean selector_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector_0")) return false;
    boolean r;
    r = consumeToken(b, DOT);
    if (!r) r = consumeToken(b, HASH);
    return r;
  }

  /* ********************************************************** */
  // selector  literal_object
  public static boolean selector_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selector_block")) return false;
    if (!nextTokenIs(b, "<selector block>", DOT, HASH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECTOR_BLOCK, "<selector block>");
    r = selector(b, l + 1);
    r = r && literal_object(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<'  pascalidentifier  attribute_key_value_pair*  '/'  '>'
  public static boolean self_closing_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "self_closing_tag")) return false;
    if (!nextTokenIs(b, XO_REL_LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, XO_REL_LT, PASCALIDENTIFIER);
    r = r && self_closing_tag_2(b, l + 1);
    r = r && consumeTokens(b, 0, XO_DIV, XO_REL_GT);
    exit_section_(b, m, SELF_CLOSING_TAG, r);
    return r;
  }

  // attribute_key_value_pair*
  private static boolean self_closing_tag_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "self_closing_tag_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!attribute_key_value_pair(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "self_closing_tag_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '@'  "settings"  '{' selector_block*  '}'
  public static boolean settings_block_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "settings_block_declaration")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT);
    r = r && consumeToken(b, "settings");
    r = r && consumeToken(b, LCURLY);
    r = r && settings_block_declaration_3(b, l + 1);
    r = r && consumeToken(b, RCURLY);
    exit_section_(b, m, SETTINGS_BLOCK_DECLARATION, r);
    return r;
  }

  // selector_block*
  private static boolean settings_block_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "settings_block_declaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!selector_block(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "settings_block_declaration_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // identifier  ':'
  public static boolean settings_key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "settings_key")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    exit_section_(b, m, SETTINGS_KEY, r);
    return r;
  }

  /* ********************************************************** */
  // settings_key  settings_value  ','?
  public static boolean settings_key_value_pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "settings_key_value_pair")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = settings_key(b, l + 1);
    r = r && settings_value(b, l + 1);
    r = r && settings_key_value_pair_2(b, l + 1);
    exit_section_(b, m, SETTINGS_KEY_VALUE_PAIR, r);
    return r;
  }

  // ','?
  private static boolean settings_key_value_pair_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "settings_key_value_pair_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // literal_value | literal_object | expression_wrapped
  public static boolean settings_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "settings_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SETTINGS_VALUE, "<settings value>");
    r = literal_value(b, l + 1);
    if (!r) r = literal_object(b, l + 1);
    if (!r) r = expression_wrapped(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // statement_if | statement_for | statement_slot
  public static boolean statement_control_flow(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_control_flow")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_CONTROL_FLOW, "<statement control flow>");
    r = statement_if(b, l + 1);
    if (!r) r = statement_for(b, l + 1);
    if (!r) r = statement_slot(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'for'  statement_for_predicate_declaration  'in'  statement_for_source  '{'  inner_nodes  '}'
  public static boolean statement_for(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_for")) return false;
    if (!nextTokenIs(b, FOR_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR_KEYWORD);
    r = r && statement_for_predicate_declaration(b, l + 1);
    r = r && consumeToken(b, IN_KEYWORD);
    r = r && statement_for_source(b, l + 1);
    r = r && consumeToken(b, LCURLY);
    r = r && inner_nodes(b, l + 1);
    r = r && consumeToken(b, RCURLY);
    exit_section_(b, m, STATEMENT_FOR, r);
    return r;
  }

  /* ********************************************************** */
  // identifier |
  //     ('('  identifier  ',' identifier ')')
  public static boolean statement_for_predicate_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_for_predicate_declaration")) return false;
    if (!nextTokenIs(b, "<statement for predicate declaration>", IDENTIFIER, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_FOR_PREDICATE_DECLARATION, "<statement for predicate declaration>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = statement_for_predicate_declaration_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '('  identifier  ',' identifier ')'
  private static boolean statement_for_predicate_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_for_predicate_declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, IDENTIFIER, COMMA, IDENTIFIER, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // xo_range | xo_symbol
  public static boolean statement_for_source(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_for_source")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_FOR_SOURCE, "<statement for source>");
    r = xo_range(b, l + 1);
    if (!r) r = xo_symbol(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "if"  expression_body  '{'  inner_nodes  '}'
  public static boolean statement_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_if")) return false;
    if (!nextTokenIs(b, IF_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF_KEYWORD);
    r = r && expression_body(b, l + 1);
    r = r && consumeToken(b, LCURLY);
    r = r && inner_nodes(b, l + 1);
    r = r && consumeToken(b, RCURLY);
    exit_section_(b, m, STATEMENT_IF, r);
    return r;
  }

  /* ********************************************************** */
  // 'slot'  expression_body
  public static boolean statement_slot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_slot")) return false;
    if (!nextTokenIs(b, SLOT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SLOT_KEYWORD);
    r = r && expression_body(b, l + 1);
    exit_section_(b, m, STATEMENT_SLOT, r);
    return r;
  }

  /* ********************************************************** */
  // (expression_body  (','  expression_body)*)?
  public static boolean xo_function_args_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_function_args_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, XO_FUNCTION_ARGS_LIST, "<xo function args list>");
    xo_function_args_list_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // expression_body  (','  expression_body)*
  private static boolean xo_function_args_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_function_args_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_body(b, l + 1);
    r = r && xo_function_args_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (','  expression_body)*
  private static boolean xo_function_args_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_function_args_list_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!xo_function_args_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "xo_function_args_list_0_1", c)) break;
    }
    return true;
  }

  // ','  expression_body
  private static boolean xo_function_args_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_function_args_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression_body(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier  (('::')  identifier)*  ('(' xo_function_args_list ')')
  public static boolean xo_function_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_function_call")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && xo_function_call_1(b, l + 1);
    r = r && xo_function_call_2(b, l + 1);
    exit_section_(b, m, XO_FUNCTION_CALL, r);
    return r;
  }

  // (('::')  identifier)*
  private static boolean xo_function_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_function_call_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!xo_function_call_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "xo_function_call_1", c)) break;
    }
    return true;
  }

  // ('::')  identifier
  private static boolean xo_function_call_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_function_call_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SUBCLASS);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' xo_function_args_list ')'
  private static boolean xo_function_call_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_function_call_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && xo_function_args_list(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // xo_add |
  //     xo_bool_and |
  //     xo_bool_or |
  //     xo_div |
  //     xo_exp |
  //     xo_mod |
  //     xo_mul |
  //     xo_rel_eq |
  //     xo_rel_gt |
  //     xo_rel_gte |
  //     xo_rel_lt |
  //     xo_rel_lte |
  //     xo_rel_neq |
  //     xo_sub |
  //     xo_tern_then |
  //     xo_tern_else
  public static boolean xo_infix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_infix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, XO_INFIX, "<xo infix>");
    r = consumeToken(b, XO_ADD);
    if (!r) r = consumeToken(b, XO_BOOL_AND);
    if (!r) r = consumeToken(b, XO_BOOL_OR);
    if (!r) r = consumeToken(b, XO_DIV);
    if (!r) r = consumeToken(b, XO_EXP);
    if (!r) r = consumeToken(b, XO_MOD);
    if (!r) r = consumeToken(b, XO_MUL);
    if (!r) r = consumeToken(b, XO_REL_EQ);
    if (!r) r = consumeToken(b, XO_REL_GT);
    if (!r) r = consumeToken(b, XO_REL_GTE);
    if (!r) r = consumeToken(b, XO_REL_LT);
    if (!r) r = consumeToken(b, XO_REL_LTE);
    if (!r) r = consumeToken(b, XO_REL_NEQ);
    if (!r) r = consumeToken(b, XO_SUB);
    if (!r) r = consumeToken(b, XO_TERN_THEN);
    if (!r) r = consumeToken(b, XO_TERN_ELSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // literal_enum_value | literal_tuple_access | literal_number_with_unit | literal_number  | string | literal_tuple
  public static boolean xo_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, XO_LITERAL, "<xo literal>");
    r = literal_enum_value(b, l + 1);
    if (!r) r = literal_tuple_access(b, l + 1);
    if (!r) r = literal_number_with_unit(b, l + 1);
    if (!r) r = literal_number(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = literal_tuple(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier?  '{' xo_object_settings_key_value_pair*  '}'
  public static boolean xo_object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_object")) return false;
    if (!nextTokenIs(b, "<xo object>", IDENTIFIER, LCURLY)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, XO_OBJECT, "<xo object>");
    r = xo_object_0(b, l + 1);
    r = r && consumeToken(b, LCURLY);
    r = r && xo_object_2(b, l + 1);
    r = r && consumeToken(b, RCURLY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identifier?
  private static boolean xo_object_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_object_0")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  // xo_object_settings_key_value_pair*
  private static boolean xo_object_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_object_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!xo_object_settings_key_value_pair(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "xo_object_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // settings_key  expression_body  ','?
  public static boolean xo_object_settings_key_value_pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_object_settings_key_value_pair")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = settings_key(b, l + 1);
    r = r && expression_body(b, l + 1);
    r = r && xo_object_settings_key_value_pair_2(b, l + 1);
    exit_section_(b, m, XO_OBJECT_SETTINGS_KEY_VALUE_PAIR, r);
    return r;
  }

  // ','?
  private static boolean xo_object_settings_key_value_pair_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_object_settings_key_value_pair_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // xo_neg | xo_bool_not
  public static boolean xo_prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_prefix")) return false;
    if (!nextTokenIs(b, "<xo prefix>", XO_BOOL_NOT, XO_NEG)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, XO_PREFIX, "<xo prefix>");
    r = consumeToken(b, XO_NEG);
    if (!r) r = consumeToken(b, XO_BOOL_NOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression_grouped | xo_function_call | xo_object | xo_literal | xo_range | xo_tuple | xo_symbol
  public static boolean xo_primary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_primary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, XO_PRIMARY, "<xo primary>");
    r = expression_grouped(b, l + 1);
    if (!r) r = xo_function_call(b, l + 1);
    if (!r) r = xo_object(b, l + 1);
    if (!r) r = xo_literal(b, l + 1);
    if (!r) r = xo_range(b, l + 1);
    if (!r) r = xo_tuple(b, l + 1);
    if (!r) r = xo_symbol(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (xo_literal | xo_symbol)  (xo_range_inclusive | xo_range_exclusive)  (xo_literal | xo_symbol)
  public static boolean xo_range(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_range")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, XO_RANGE, "<xo range>");
    r = xo_range_0(b, l + 1);
    r = r && xo_range_1(b, l + 1);
    r = r && xo_range_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // xo_literal | xo_symbol
  private static boolean xo_range_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_range_0")) return false;
    boolean r;
    r = xo_literal(b, l + 1);
    if (!r) r = xo_symbol(b, l + 1);
    return r;
  }

  // xo_range_inclusive | xo_range_exclusive
  private static boolean xo_range_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_range_1")) return false;
    boolean r;
    r = consumeToken(b, XO_RANGE_INCLUSIVE);
    if (!r) r = consumeToken(b, XO_RANGE_EXCLUSIVE);
    return r;
  }

  // xo_literal | xo_symbol
  private static boolean xo_range_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_range_2")) return false;
    boolean r;
    r = xo_literal(b, l + 1);
    if (!r) r = xo_symbol(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '$'?  identifier  (('.'  identifier) | ('['  expression_body  ']') )*
  public static boolean xo_symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_symbol")) return false;
    if (!nextTokenIs(b, "<xo symbol>", IDENTIFIER, XO_DOLLAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, XO_SYMBOL, "<xo symbol>");
    r = xo_symbol_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && xo_symbol_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '$'?
  private static boolean xo_symbol_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_symbol_0")) return false;
    consumeToken(b, XO_DOLLAR);
    return true;
  }

  // (('.'  identifier) | ('['  expression_body  ']') )*
  private static boolean xo_symbol_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_symbol_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!xo_symbol_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "xo_symbol_2", c)) break;
    }
    return true;
  }

  // ('.'  identifier) | ('['  expression_body  ']')
  private static boolean xo_symbol_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_symbol_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xo_symbol_2_0_0(b, l + 1);
    if (!r) r = xo_symbol_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.'  identifier
  private static boolean xo_symbol_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_symbol_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // '['  expression_body  ']'
  private static boolean xo_symbol_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_symbol_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LSQUARE);
    r = r && expression_body(b, l + 1);
    r = r && consumeToken(b, RSQUARE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "("  expression_body  (","  expression_body)*  ")"
  public static boolean xo_tuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_tuple")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && expression_body(b, l + 1);
    r = r && xo_tuple_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, XO_TUPLE, r);
    return r;
  }

  // (","  expression_body)*
  private static boolean xo_tuple_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_tuple_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!xo_tuple_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "xo_tuple_2", c)) break;
    }
    return true;
  }

  // ","  expression_body
  private static boolean xo_tuple_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xo_tuple_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression_body(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
