/**
 * In Eclipse
 *  1) Write your Class.
 *  2) Go to Source Menu + Generate hashCode() and equals()
 *  
 */

package com.rp.override.equals.method;

public class IdeToGenerateHashCodeAndEqualsMethod {

	private int id;
	private String firstNmae;
	private String lastName;

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstNmae == null) ? 0 : firstNmae.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		//if (obj == null && (getClass() != obj.getClass())){
		if (obj == null || (getClass() != obj.getClass())){
			return false;
		}

		IdeToGenerateHashCodeAndEqualsMethod other = (IdeToGenerateHashCodeAndEqualsMethod) obj;
		if (firstNmae == null) {
			if (other.firstNmae != null)
				return false;
		} else if (!firstNmae.equals(other.firstNmae))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
}
