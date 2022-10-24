package com.bononi.principal;

	import java.io.Serializable;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Objects;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	import com.fasterxml.jackson.annotation.JsonIgnore;

	@Entity
	public class Usuario implements Serializable {
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer Id;
		private String nome;
		private String email;
		@JsonIgnore
		private String senha;
		
		// private List<Permissao> permissoes = new ArrayList<>();
		
		public Usuario() {
			super();
		}

		public Usuario(Integer id, String nome, String email, String senha, List<Permissao> permissoes) {
			super();
			Id = id;
			this.nome = nome;
			this.email = email;
			this.senha = senha;
			// this.permissoes = permissoes;
		}

		@Override
		public String toString() {
			return "Usuario [Id=" + Id + ", nome=" + nome + ", email=" + email + ", senha=" + senha;  //", permissoes="
					//+ permissoes + "]";
		}

		public Integer getId() {
			return Id;
		}

		public void setId(Integer id) {
			Id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		//public java.util.List<Permissao> getPermissoes() {
			//return permissoes;
		//}

		//public void setPermissoes(java.util.List<Permissao> permissoes) {
			//this.permissoes = permissoes;
		//}

		@Override
		public int hashCode() {
			return Objects.hash(Id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Usuario other = (Usuario) obj;
			return Objects.equals(Id, other.Id);
		}
	}