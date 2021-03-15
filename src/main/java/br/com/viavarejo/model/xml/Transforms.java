package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Transforms")
public class Transforms {

	public Transform Transform;

	public Transform getTransform() {
		return Transform;
	}

	public void setTransform(Transform transform) {
		Transform = transform;
	}

}
