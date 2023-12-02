//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.02.25 at 12:10:48 PM CET
//

package org.graphdrawing.graphml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for graph.nodeids.type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 *
 * <pre>
 * &lt;simpleType name="graph.nodeids.type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="canonical"/>
 *     &lt;enumeration value="free"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "graph.nodeids.type")
@XmlEnum
public enum GraphNodeidsType {

	@XmlEnumValue("canonical")
	CANONICAL("canonical"), @XmlEnumValue("free")
	FREE("free");

	private final String value;

	GraphNodeidsType(final String v) {
		this.value = v;
	}

	public String value() {
		return this.value;
	}

	public static GraphNodeidsType fromValue(final String v) {
		for (final GraphNodeidsType c : GraphNodeidsType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}