/*
Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.
*/

public String backAround(String str) {
  String last = str.substring(str.length()-1);
  return last + str + last;
}