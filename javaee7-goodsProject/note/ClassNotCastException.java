/*
ClassNotCastException:


	类无法转换异常
	究竟什么样子是无法转换的呢？
	
	在这个jar包里定义了一个超级实体接口SuperEntity<T extends Serializable>
	这里的实体类必须实现Serializable接口
	如果接收的实体类传到数据访问层中没有实现Serializable接口则抛出类无法转换异常
	例如
	
*/
	
	/** 没有实现Serializable */
	class Person {
		
	}
	
	@Repository
	class DAOImpl implements DAO {
		//注入SessionFactory
		
		void operator() throws ClassNotCastException {
			//此时此类并不是Serializable接口的子类
			if (! DAOImpl instanceOf Serializable) {
				throw new ClassNotCastException();
			} else {
				//do operator
			}
		}
	}
	
	/** 实现后就不会报异常, 所以在写代码时应将代码写成如下结构:*/
	class Person2 implements SuperEntity<Integer> {
		//integer 主键 get/set
		
		
	}
	
	class PersonDAOImpl implements PersonDAO {
		SessionFactory sessionFactory;
	}
	


